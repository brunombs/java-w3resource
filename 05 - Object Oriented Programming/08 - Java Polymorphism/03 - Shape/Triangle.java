public class Triangle extends Shape {
    final private double a;
    final private double b;
    final private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        return a * b * c;
    }
}
