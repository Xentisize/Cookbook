package ch01;

public class Vehicle {
    private int weightPounds;
    private Engine engine;

    public Vehicle(int weightPounds, Engine engine) {
        this.weightPounds = weightPounds;
        this.engine = engine;
    }

    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec, weightPounds);
    }

    public static void main(String... args) {
        double timeSec = 10.0;
        int horsePower = 246;
        int vehicleWeight = 4000;
        Engine engine = new Engine();
        engine.setHorsePower(horsePower);
        Vehicle vehicle = new Vehicle(vehicleWeight, engine);
        System.out.println("Vehicle spped (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph.");
    }
}
