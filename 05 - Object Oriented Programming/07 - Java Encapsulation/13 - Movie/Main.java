// Write a Java program to create a class called Movie with private instance variables title, director, and duration. Provide public getter and setter methods to access and modify these variables. Add a method called getMovieDetails() that returns a formatted string containing the movie details.

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setDuration(1.30);
        movie.setTitle("Java Encapsulation");
        movie.getMovieDetails();
    }
}
