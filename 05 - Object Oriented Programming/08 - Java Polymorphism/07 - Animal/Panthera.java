public class Panthera extends Animal {
    void move(){
        System.out.println("Panthera walks");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera roars");
    }
}
