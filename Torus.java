public class Torus extends ThreeDimensionalShape {
    private double majorRadius, minorRadius;

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public String getName() {
        return "Torus";
    }
}
