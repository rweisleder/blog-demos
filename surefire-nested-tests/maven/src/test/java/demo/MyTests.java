package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTests {

    @Test
    public void firstTest() {
        assertEquals(2, 1 + 1);
    }

    public static class NestedTests {

        @Test
        public void secondTest() {
            assertEquals(3, 1 + 1);
        }
    }
}
