package advanceacademyoop.artwork;

public class Song extends ArtWork {
    private int minutes;

    public Song(String title, String author, int minutes) {
        super(title, author);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
