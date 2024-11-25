public class Cube extends Shape3D {
    final private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateSurfaceArea() {
        return Math.pow(sideLength, 3);
    }

    @Override
    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
