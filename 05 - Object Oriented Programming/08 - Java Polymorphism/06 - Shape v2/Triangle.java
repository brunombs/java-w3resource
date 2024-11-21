public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
