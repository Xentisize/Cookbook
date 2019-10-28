package ch01;

public class VehicleInner {
    private int weightPounds;
    private Engine engine;

    public VehicleInner(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.engine = new Engine(horsePower);
    }

    public double getSpeedMph(double timeSec) {
        // Vehicle#getSpeedMph() can access Engine class even it is private.
        // It can even access the private methods in Engine class.
        return this.engine.getSpeedMph(timeSec);
    }

    private int getWeightPounds() {
        return this.weightPounds;
    }

    private class Engine {
        private int horsePower;

        private Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        private double getSpeedMph(double timeSec) {
            // inner class can access all private elements of the enclosing class
            // so it can access the getWeightPounds() in the Vehicle class.
            double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / getWeightPounds();
            return Math.round(Math.sqrt(v) * 0.68);
        }
    }
}
