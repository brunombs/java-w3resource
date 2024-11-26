public class WebPage implements Searchable {
    private final String title;

    public WebPage(String title) {
        this.title = title;
    }

    @Override
    public boolean search(String keyword) {
        return title.contains(keyword);
    }
}
