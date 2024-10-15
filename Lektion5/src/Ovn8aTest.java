import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ovn8aTest {
    @Test
    void testGetAverage() {
        Ovn8a ovn8a = new Ovn8a();
        assertEquals(12.74, ovn8a.getAverage());
    }

    @Test
    void testGetMax() {
        Ovn8a ovn8a = new Ovn8a();
        assertEquals(17.5, ovn8a.getMax());
    }

    @Test
    void testGetMin() {
        Ovn8a ovn8a = new Ovn8a();
        assertEquals(6.4, ovn8a.getMin());
    }
}
