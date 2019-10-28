package ch01;

public class Car extends Vehicle {
    private int passengersCount;

    public Car(int passengersCount, int weightPounds, Engine engine) {
        super(weightPounds, engine);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public static void main(String... args) {
        double timeSec = 10.0;
        int horsePower = 246;
        int vehicleWeight = 4000;
        Engine engine = new Engine();
        engine.setHorsePower(horsePower);
        // Polymorphism, a reference to the object of the Car class can be assigned to the reference of its base class.
        Vehicle vehicle = new Car(4, vehicleWeight, engine);
        System.out.println("Car speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
}
