public class Circle extends Shape2D {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    public void resize() {
        System.out.println("Inside Circle::resize() method.");
    }
}
