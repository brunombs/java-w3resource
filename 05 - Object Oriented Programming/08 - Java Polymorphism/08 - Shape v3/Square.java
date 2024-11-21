public class Square extends Shape {
    final private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
