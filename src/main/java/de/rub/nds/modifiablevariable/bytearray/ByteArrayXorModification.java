/**
 * ModifiableVariable - A Variable Concept for Runtime Modifications
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.modifiablevariable.bytearray;

import de.rub.nds.modifiablevariable.VariableModification;
import de.rub.nds.modifiablevariable.util.ArrayConverter;
import de.rub.nds.modifiablevariable.util.ByteArrayAdapter;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
@XmlRootElement
@XmlType(propOrder = { "xor", "startPosition", "modificationFilter", "postModification" })
public class ByteArrayXorModification extends VariableModification<byte[]> {

    private byte[] xor;

    private int startPosition;

    public ByteArrayXorModification() {

    }

    public ByteArrayXorModification(byte[] xor, int startPosition) {
        this.xor = xor;
        this.startPosition = startPosition;
    }

    @Override
    protected byte[] modifyImplementationHook(byte[] input) {
        if (input == null) {
            input = new byte[0];
        }
        byte[] result = input.clone();
        int start = startPosition;
        if (start < 0) {
            start += input.length;
        }
        final int end = start + xor.length;
        if (end > result.length) {
            // result = new byte[end];
            // System.arraycopy(input, 0, result, 0, input.length);
            LOGGER.debug(String.format(
                    "Input {%s} of length %d cannot be xored with {%s} of length %d with start position %d",
                    ArrayConverter.bytesToHexString(input), input.length, ArrayConverter.bytesToHexString(xor),
                    xor.length, startPosition));
            return input;
        }
        for (int i = 0; i < xor.length; ++i) {
            result[start + i] = (byte) (input[start + i] ^ xor[i]);
        }
        return result;
    }

    @XmlJavaTypeAdapter(ByteArrayAdapter.class)
    public byte[] getXor() {
        return xor;
    }

    public void setXor(byte[] xor) {
        this.xor = xor;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }
}
