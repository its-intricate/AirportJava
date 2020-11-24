package airport;

import java.util.ArrayList;
import java.util.Random;

public class Airport {
    ArrayList<Plane> landed_planes;
    int capacity;
    boolean stormy;

    public Airport(int x) {
        landed_planes = new ArrayList<>();
        capacity = x;
        stormy = isStormy();
    }


    public void land(Plane plane) {
        landed_planes.add(plane);
    }

    public void takeoff(Plane plane) {
        landed_planes.remove(plane);
    }

    public boolean isFull() {
        return landed_planes.size() >= capacity;
    }

    public boolean isHere(Plane plane) {
        return landed_planes.contains(plane);
    }

    public boolean isStormy() {
        Random rand = new Random();
        int upperbound = 10;
        int generator = rand.nextInt(upperbound);
        return generator == 0;
    }
}
