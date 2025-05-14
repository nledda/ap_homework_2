package Task_2;

public interface Refuelable {
    void refuel(double liters);
    double getFuelLevel();
    double getRange();

    // Default method implementation
    default boolean canReach(double distance) {
        return getRange() >= distance;
    }


}


