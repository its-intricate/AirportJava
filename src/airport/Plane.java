package airport;

class Plane {
    boolean flying;
    Airport current_airport;

    public Plane() {
        flying = true;
        current_airport = null;
    }

   public void land(Airport airport) {
        Limits errors = new Limits();
        errors.land(this, airport);
   }

    public void takeoff(Airport airport) {
        Limits errors = new Limits();
        errors.takeoff(this, airport);
    }
}