public class Cylinder extends Circle {
    final private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    double calculateArea() {
        double circleArea = super.calculateArea();
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * circleArea + sideArea;
    }
}
