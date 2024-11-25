public class Sphere extends Shape3D {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
