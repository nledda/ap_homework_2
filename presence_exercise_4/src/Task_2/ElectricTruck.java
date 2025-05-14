package Task_2;

public class ElectricTruck extends Vehicle implements Electrified {
    private double batteryLevel;
    private final double efficiency = 1.5; // kWh per km

    public ElectricTruck(String id, double maxLoad) {
        super(id, maxLoad);
        this.batteryLevel = MAX_BATTERY_KWH; // fully charged
    }

    @Override
    public double getRange() {
        return batteryLevel / efficiency;
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * efficiency;
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
