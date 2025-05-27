public class Cylinder extends ThreeDimensionalShape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
