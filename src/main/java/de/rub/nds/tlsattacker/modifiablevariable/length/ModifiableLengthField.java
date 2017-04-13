/**
 * ModifiableVariable - A Variable Concept for Runtime Modifications
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.modifiablevariable.length;

import de.rub.nds.tlsattacker.modifiablevariable.integer.*;
import de.rub.nds.tlsattacker.modifiablevariable.bytearray.ModifiableByteArray;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
@XmlRootElement
@XmlSeeAlso({ IntegerAddModification.class, IntegerExplicitValueModification.class, IntegerSubtractModification.class,
        IntegerXorModification.class })
@XmlType(propOrder = { "originalValue", "modification", "assertEquals" })
public class ModifiableLengthField extends ModifiableInteger {

    private final ModifiableByteArray ref;

    public ModifiableLengthField(ModifiableByteArray ref) {
        this.ref = ref;
    }

    @Override
    public Integer getOriginalValue() {
        return ref.getValue().length;
    }

    @Override
    public void setOriginalValue(Integer originalValue) {
        throw new UnsupportedOperationException("Cannot set original Value of ModifiableLengthField");
    }

}
