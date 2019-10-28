package ch01;

public class CarInherit extends VehicleInherit {
    private int passengersCount;

    public CarInherit(int passengersCount, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public double getSpeedMph(double timeSec) {
        int weight = this.weightPounds + this.passengersCount * 250;
        return getSpeedMph(timeSec, weight);
    }
}
