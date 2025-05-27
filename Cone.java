public class Cone extends ThreeDimensionalShape {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String getName() {
        return "Cone";
    }
}
