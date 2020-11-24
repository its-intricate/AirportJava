package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    Plane plane1 = new Plane();
    Airport airport1 = new Airport(10);

    @Test
    public void init() {
        assertNull(plane1.current_airport);
        assertTrue(plane1.flying);
    }

    @Test
    public void land() {
        plane1.land(airport1);
        assertFalse(plane1.flying);
        assertEquals(airport1, plane1.current_airport);
    }

    @Test
    public void takeoff() {
        plane1.land(airport1);
        plane1.takeoff(airport1);
        assertTrue(plane1.flying);
        assertNull(plane1.current_airport);
    }
}