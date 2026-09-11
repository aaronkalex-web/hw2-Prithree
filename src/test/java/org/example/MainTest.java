package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void convert_returnsExpectedLength() {
        String[] result = Main.convert();
        assertEquals(114, result.length);
    }

    @Test
    void convert_firstWordIsCorrect() {
        String[] result = Main.convert();
        assertEquals("Shall", result[0]);
    }

    @Test
    void convert_lastWordIsCorrect() {
        String[] result = Main.convert();
        assertEquals("thee.", result[result.length-1]);
    }
}