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
import java.util.Objects;
import java.util.Random;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"subtrahend", "modificationFilter", "postModification"})
public class ByteSubtractModification extends VariableModification<Byte> {

    private final static int MAX_SUBTRACT_MODIFIER = 16;

    private Byte subtrahend;

    public ByteSubtractModification() {

    }

    public ByteSubtractModification(Byte bi) {
        this.subtrahend = bi;
    }

    @Override
    protected Byte modifyImplementationHook(Byte input) {
        if (input == null) {
            input = 0;
        }
        return (byte) (input - subtrahend);
    }

    public Byte getSubtrahend() {
        return subtrahend;
    }

    public void setSubtrahend(Byte subtrahend) {
        this.subtrahend = subtrahend;
    }

    @Override
    public VariableModification<Byte> getModifiedCopy() {
        return new ByteAddModification((byte) (subtrahend + new Random().nextInt(MAX_SUBTRACT_MODIFIER)));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.subtrahend);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ByteSubtractModification other = (ByteSubtractModification) obj;
        if (!Objects.equals(this.subtrahend, other.subtrahend)) {
            return false;
        }
        return true;
    }
}
