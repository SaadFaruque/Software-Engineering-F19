package edu.qc.seclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuggyClassTestBC2 {

    @Test
    public void buggyMethod2() {
        assertEquals(0, BuggyClass.buggyMethod2(6, 2));
    }
}
