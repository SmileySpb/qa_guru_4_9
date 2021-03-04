package io.qaguru.mkanin;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleAssertTest {
    @Test
    @Tag("POSITIVE")
    void firstPositiveTest() {
        assertEquals(true, true);
    }

    @Test
    @Tag("POSITIVE")
    void secondPositiveTest() {
        assertEquals(true, true);
    }

    @Test
    @Tag("NEGATIVE")
    void firstNegativeTest() {
        assertEquals(true, false);
    }

    @Test
    @Tag("NEGATIVE")
    void secondNegativeTest() {
        assertEquals(true, false);
    }
}
