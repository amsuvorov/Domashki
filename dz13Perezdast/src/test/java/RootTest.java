
package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootTest {

    @Test
    void testToStringNoRoots() {
        Root noRoot = new Root();

        String expected = "Рівняння не має коренів.";

        assertEquals(expected, noRoot.toString());

    }
    @Test
    void testToStringOneRoot() {
        Root oneRoot = new Root(3.0);

        String expected = "Рівняння ax^2 + bx + c = 0 має корені: x = 3.0";

        assertEquals(expected, oneRoot.toString());
    }
    @Test
    void testToStringTwoRoots() {
        Root twoRoot = new Root(3.0, 2.0);

        String expected = "Рівняння ax^2 + bx + c = 0 має корені: x1 = 3.0, x2 = 2.0";

        assertEquals(expected, twoRoot.toString());
    }




}
