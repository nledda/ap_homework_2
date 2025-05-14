package Task_2;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel;
    private final double fuelCapacity = 200; // liters
    private final double fuelEfficiency = 0.3; // liters per km

    public Truck(String id, double maxLoad) {
        super(id, maxLoad);
        this.fuelLevel = fuelCapacity; // full tank
    }

    @Override
    public double getRange() {
        return fuelLevel / fuelEfficiency;
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * fuelEfficiency;
    }

    @Override
    public void refuel(double liters) {
        double newLevel = Math.min(fuelLevel + liters, fuelCapacity);
        fuelLevel = newLevel;
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }


}
