/**
 * ModifiableVariable - A Variable Concept for Runtime Modifications
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.modifiablevariable.singlebyte;

import de.rub.nds.modifiablevariable.VariableModification;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
@XmlRootElement
@XmlType(propOrder = { "xor", "modificationFilter", "postModification" })
public class ByteXorModification extends VariableModification<Byte> {

    private Byte xor;

    public ByteXorModification() {

    }

    public ByteXorModification(Byte bi) {
        this.xor = bi;
    }

    @Override
    protected Byte modifyImplementationHook(Byte input) {
        if (input == null) {
            input = 0;
        }
        return (byte) (input ^ xor);
    }

    public Byte getXor() {
        return xor;
    }

    public void setXor(Byte xor) {
        this.xor = xor;
    }
}