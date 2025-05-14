package Task_2;

public class HybridTruck extends Vehicle implements Refuelable, Electrified {
    private double fuelLevel;
    private double batteryLevel;
    private final double fuelCapacity = 100; // liters
    private final double fuelEfficiency = 0.2; // liters per km
    private final double electricEfficiency = 1.0; // kWh per km

    public HybridTruck(String id, double maxLoad) {
        super(id, maxLoad);
        this.fuelLevel = fuelCapacity; // full tank
        this.batteryLevel = MAX_BATTERY_KWH; // fully charged
    }

    @Override
    public double getRange() {
        double rangeFromFuel = fuelLevel / fuelEfficiency;
        double rangeFromBattery = batteryLevel / electricEfficiency;
        return rangeFromFuel + rangeFromBattery;
    }

    @Override
    public double fuelNeeded(double distance) {
        // Assuming we use battery first, then fuel
        if (distance <= batteryLevel / electricEfficiency) {
            return 0; // Can cover with battery alone
        } else {
            double remainingDistance = distance - (batteryLevel / electricEfficiency);
            return remainingDistance * fuelEfficiency;
        }
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

    @Override
    public void charge(double kWh) {
        double newLevel = Math.min(batteryLevel + kWh, MAX_BATTERY_KWH);
        batteryLevel = newLevel;
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }
}