package edu.qc.seclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuggyClassTestSC2 {

   //Cannot divide by 0
    @Test
    public void buggyMethod2() {
        assertEquals(2, BuggyClass.buggyMethod2(1, 2));
    }
}
