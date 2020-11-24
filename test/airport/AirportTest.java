package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport1 = new Airport(10);
    Airport airport2 = new Airport(1);
    Plane plane1 = new Plane();

    @Test
    public void init() {
        assertEquals(10, airport1.capacity);
        assertTrue(airport1.landed_planes.isEmpty());
    }

    @Test
    public void land() {
        airport1.land(plane1);
        assertTrue(airport1.landed_planes.contains(plane1));
    }

    @Test
    public void takeoff() {
        airport1.land(plane1);
        airport1.takeoff(plane1);
        assertTrue(airport1.landed_planes.isEmpty());
    }

    @Test
    public void isFull() {
       airport2.land(plane1);
       assertTrue(airport2.isFull());
    }

    @Test
    public void isHere() {
        airport1.land(plane1);
        assertTrue(airport1.isHere(plane1));
    }

    @Test
    public void isNotHere() {
        assertFalse(airport1.isHere(plane1));
    }

    @Test
    public void isStormy() {
        assertFalse(airport1.isStormy());
    }
}