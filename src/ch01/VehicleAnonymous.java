package ch01;

public class VehicleAnonymous {
    public static void main(String[] args) {
        double timeSec = 10.0;
        int engineHorsePower = 246;
        int vehicleWeightPounds = 4000;

        // Anonymous inner class can access any member of the enclosing class, if
        // the fields of the enclosing class are declared final.
        VehicleLocal vehicle = new VehicleLocal(vehicleWeightPounds, engineHorsePower) {
            public double getSpeedMph(double timeSec) {
                double v = 2.0 * engineHorsePower * 746 * timeSec * 32.17 / vehicleWeightPounds;
                return Math.round(Math.sqrt(v) * 0.68);
            }
        };

        System.out.println("Vehicle speed (" + timeSec + ") = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
}
