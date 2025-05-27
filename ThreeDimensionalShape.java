public abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape() {
        this.numberOfDimensions = 3;
    }

    public abstract double getVolume();
}
