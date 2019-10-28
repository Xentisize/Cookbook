package ch01;

public class VehicleInherit {
    int weightPounds, horsePower;

    // No implicit nor explicit constructor without parameters
    // Subclasses have to class super() as the first line of their constructor
    public VehicleInherit(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    protected double getSpeedMph(double timeSec, int weightPounds) {
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / weightPounds;
        return Math.round(Math.sqrt(v) * 0.68);
    }

    public static void main(String[] args) {
        double timeSec = 10.0;
        int engineHorsePower = 246;
        int vehicleWeightPounds = 4000;
        VehicleInherit vehicle = new CarInherit(4, vehicleWeightPounds, engineHorsePower);
        // To invoke a method that exists only in the subclass, you have to cast such a reference to the subclass type
        System.out.println("Passengers count = " + ((CarInherit)vehicle).getPassengersCount());
        // The overridden method is dynamically bound.
        // The method invocation is determined by the type of the actual object being referred to.
        // So the reference vehicle points to an object of the Car subclass, .getSpeedMph is invoked, not the base class's.
        // However, the signature needs to be the same as the base class's.
        System.out.println("Car speed (" + timeSec + " sec) = " + ((CarInherit)vehicle).getSpeedMph(timeSec) + " mph");
        vehicle = new TruckInherit(3300, vehicleWeightPounds, engineHorsePower);
        System.out.println("Payload = " + ((TruckInherit)vehicle).getPayload() + " pounds.");
        System.out.println("Truck speed (" + timeSec + " sec) = " + ((TruckInherit)vehicle).getSpeedMph(timeSec) + " mph");
    }
}
