public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();

        Lion lion = new Lion();
        lion.eat();
        lion.sound();

        Panther panther = new Panther();
        panther.eat();
        panther.sound();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sound();
    }
}
