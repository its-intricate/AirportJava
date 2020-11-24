package airport;

public class Limits {

    public void land(Plane plane, Airport airport) throws Error {
        if (airport.isFull()) {
            throw new Error("Airport is full");
        }
        else if (airport.stormy) {
            throw new Error("Airport is stormy");
        }
        else if (plane.flying == false) {
            throw new Error("Plane has already landed");
        }
        else {
            plane.flying = false;
            plane.current_airport = airport;
            airport.land(plane);
        }
    }

    public void takeoff(Plane plane, Airport airport) throws Error {
        if (plane.flying) {
            throw new Error("Plane is already flying");
        }
        else if (airport.isHere(plane) == false) {
            throw new Error("Not at current airport");
        }
        else if (airport.stormy) {
            throw new Error("Airport is stormy");
        }
        else {
            plane.flying = true;
            plane.current_airport = null;
            airport.takeoff(plane);
        }
    }
}
