package ch01;

public class VehicleLocal {
    private int weightPounds;
    private int horsePower;

    public VehicleLocal(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    private int getWeightPounds() {
        return this.weightPounds;
    }

    public double getSpeedMph(double timeSec) {
        // Engine class is for example purpose as the speed calculation does not necessarily depend on the Engine class.
        // However, in some case, the inner class may need to inherit from other class, so the creation of inner class
        // is needed.
        class Engine {
            private int horsePower;

            private Engine(int horsePower) {
                this.horsePower = horsePower;
            }

            private double getSpeedMph(double timeSec) {
                double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / getWeightPounds();
                return Math.round(Math.sqrt(v) * 0.68);
            }
        }

        Engine engine = new Engine(this.horsePower);
        return engine.getSpeedMph(timeSec);
    }

    public static void main(String... args) {
        double timeSec = 10.0;
        VehicleLocal v = new VehicleLocal(4000, 246);
        System.out.println("Vehicle speed (" + timeSec + " sec) = " + v.getSpeedMph(timeSec) + " mph");
    }
}
