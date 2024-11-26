public class Rectangle extends Shape2D {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public void resize() {
        System.out.println("Inside Rectangle::resize() method.");
    }
}
