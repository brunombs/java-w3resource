// Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic. Print the values of these variables in the main method.

public class ComplexInitializer {
    private static final int x;
    private static final int y;
    private static final int z;

    static{
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int x, int y){
        return x * y + (x - y);
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
