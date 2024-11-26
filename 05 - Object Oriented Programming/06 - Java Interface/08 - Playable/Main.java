// Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.

public class Main {
    public static void main(String[] args) {
        Volleyball volleyball = new Volleyball();
        volleyball.play();

        Basketball basketball = new Basketball();
        basketball.play();

        Football football = new Football();
        football.play();
    }
}
