package Task_2;

public abstract class Vehicle {
    protected String id;
    protected double maxLoad;

    public Vehicle(String id, double maxLoad) {
        this.id = id;
        this.maxLoad = maxLoad;
    }

    public String getId() {
        return id;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    // Abstract methods
    public abstract double getRange();
    public abstract double fuelNeeded(double distance);
}

