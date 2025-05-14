package Task_2;

public class Task_2 {
    public static void main(String[] args) {
        // Create vehicles
        Truck diesel = new Truck("T-001", 10000);
        ElectricTruck electric = new ElectricTruck("E-001", 8000);
        HybridTruck hybrid = new HybridTruck("H-001", 9000);

        // Test range and fuel needed
        System.out.println("Diesel truck range: " + diesel.getRange() + " km");
        System.out.println("Electric truck range: " + electric.getRange() + " km");
        System.out.println("Hybrid truck range: " + hybrid.getRange() + " km");

        double tripDistance = 300;
        System.out.println("\nFuel needed for " + tripDistance + " km:");
        System.out.println("Diesel truck: " + diesel.fuelNeeded(tripDistance) + " liters");
        System.out.println("Electric truck: " + electric.fuelNeeded(tripDistance) + " kWh");
        System.out.println("Hybrid truck: " + hybrid.fuelNeeded(tripDistance) + " liters");

        // Test canReach default method
        System.out.println("\nCan reach " + tripDistance + " km?");
        System.out.println("Diesel truck: " + diesel.canReach(tripDistance));
        System.out.println("Hybrid truck: " + hybrid.canReach(tripDistance));

        // Use some fuel/battery
        diesel.refuel(-150); // Remove 150 liters
        electric.charge(-80); // Remove 80 kWh

        // Check updated ranges
        System.out.println("\nUpdated ranges after using fuel/battery:");
        System.out.println("Diesel truck range: " + diesel.getRange() + " km");
        System.out.println("Electric truck range: " + electric.getRange() + " km");

        // Test canReach after fuel consumption
        System.out.println("\nCan reach " + tripDistance + " km after fuel consumption?");
        System.out.println("Diesel truck: " + diesel.canReach(tripDistance));
    }
}

