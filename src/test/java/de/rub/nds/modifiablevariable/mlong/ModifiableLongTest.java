/*
 * Copyright 2017 Robert Merget <robert.merget@rub.de>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.rub.nds.modifiablevariable.mlong;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModifiableLongTest {

    private ModifiableLong long1;

    private ModifiableLong long2;

    @Before
    public void setUp() {
        long1 = new ModifiableLong();
        long1.setOriginalValue(2l);
        long2 = new ModifiableLong();
        long2.setOriginalValue(2l);
    }

    /**
     * Test of createRandomModification method, of class ModifiableLong.
     */
    @Test
    public void testCreateRandomModification() {
    }

    /**
     * Test of getAssertEquals method, of class ModifiableLong.
     */
    @Test
    public void testGetAssertEquals() {
    }

    /**
     * Test of setAssertEquals method, of class ModifiableLong.
     */
    @Test
    public void testSetAssertEquals() {
    }

    /**
     * Test of isOriginalValueModified method, of class ModifiableLong.
     */
    @Test
    public void testIsOriginalValueModified() {
    }

    /**
     * Test of getByteArray method, of class ModifiableLong.
     */
    @Test
    public void testGetByteArray() {
    }

    /**
     * Test of validateAssertions method, of class ModifiableLong.
     */
    @Test
    public void testValidateAssertions() {
    }

    /**
     * Test of getOriginalValue method, of class ModifiableLong.
     */
    @Test
    public void testGetOriginalValue() {
    }

    /**
     * Test of setOriginalValue method, of class ModifiableLong.
     */
    @Test
    public void testSetOriginalValue() {
    }

    /**
     * Test of toString method, of class ModifiableLong.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of equals method, of class ModifiableLong.
     */
    @Test
    public void testEquals() {
        assertEquals(long1, long2);
        long2.setOriginalValue(3l);
        assertNotEquals(long1, long2);
    }

    /**
     * Test of hashCode method, of class ModifiableLong.
     */
    @Test
    public void testHashCode() {
    }

}
