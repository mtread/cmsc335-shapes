public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String getName() {
        return "Cube";
    }
}
