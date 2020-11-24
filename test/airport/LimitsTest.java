package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitsTest {
    Airport airport1 = new Airport(10);
    Airport airport2 = new Airport(1);
    Plane plane1 = new Plane();
    Plane plane2 = new Plane();

    @Test
    public void banFullLand() {
        plane1.land(airport2);
        assertThrows(Error.class, ()->{plane2.land(airport2);});

    }

    @Test
    public void banStormyLand() {
        airport1.stormy = true;
        assertThrows(Error.class, ()->{plane1.land(airport1);});
    }

    @Test
    public void banLandedLand() {
        plane1.land(airport1);
        assertThrows(Error.class, ()->{plane1.land(airport1);});
    }

    @Test
    public void banEmptyTakeoff() {
        plane1.land(airport1);
        assertThrows(Error.class, ()->{plane1.takeoff(airport2);});
    }

    @Test
    public void banStormyTakeoff() {
        plane1.land(airport1);
        airport1.stormy = true;
        assertThrows(Error.class, ()->{plane1.takeoff(airport1);});
    }

    @Test
    public void banFlyingTakeoff() {
        assertThrows(Error.class, ()->{plane1.takeoff(airport1);});
    }
}