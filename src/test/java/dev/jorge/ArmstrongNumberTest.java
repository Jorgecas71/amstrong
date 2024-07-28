package dev.jorge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class ArmstrongNumberTest {

    @Test
    void testisArmstrong() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        assertTrue(armstrongNumber.isArmstrong(153));
        assertEquals(true, armstrongNumber.isArmstrong(153));

        assertTrue(armstrongNumber.isArmstrong(371));
        assertEquals(true, armstrongNumber.isArmstrong(371));

        assertFalse(armstrongNumber.isArmstrong(420));
        assertEquals(false, armstrongNumber.isArmstrong(420));

        assertFalse(armstrongNumber.isArmstrong(123));
        assertEquals(false, armstrongNumber.isArmstrong(123));

        // testeo del caso especial 0 que si se considera un num armstrong
        assertTrue(armstrongNumber.isArmstrong(0));
        assertEquals(true, armstrongNumber.isArmstrong(0));
    }

}
