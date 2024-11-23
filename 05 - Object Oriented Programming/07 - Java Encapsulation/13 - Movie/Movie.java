public class Movie {
    private String title;
    private double duration;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void getMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
    }
}
