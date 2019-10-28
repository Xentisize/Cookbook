package ch01;

public class TruckInherit extends VehicleInherit {
    private int payload;

    public TruckInherit(int payloadPounds, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.payload = payloadPounds;
    }

    public int getPayload() {
        return this.payload;
    }

    public double getSpeedMph(double timeSec) {
        int weight = this.weightPounds + this.payload;
        return getSpeedMph(timeSec, weight);
    }
}
