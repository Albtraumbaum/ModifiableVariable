/*
 * ModifiableVariable - A Variable Concept for Runtime Modifications
 *
 * Copyright 2014-2023 Ruhr University Bochum, Paderborn University, and Hackmanit GmbH
 *
 * Licensed under Apache License 2.0 http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.modifiablevariable.bytearray;

import org.junit.jupiter.api.BeforeEach;

public class ByteArrayOperationConcatenationTest {

    private ModifiableByteArray start;

    private byte[] expectedResult, result;

    @BeforeEach
    public void setUp() {
        start = new ModifiableByteArray();
        start.setOriginalValue(new byte[] {1, 10});
    }
}
