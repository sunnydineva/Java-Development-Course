package artwork;

public class MainArtWork {
    public static void main(String[] args) {
        Book book = new Book("BookTitle", "authorBook", 10);
        Song song = new Song("SongTitle", "authorSong", 1);

        ArtWorkInterface artWorkInterface = new ArtWorkInterfaceImpl();
        artWorkInterface.describe(book);
        artWorkInterface.describe(song);
        System.out.println("-------------------");
        artWorkInterface.addPages(book, 100);
        artWorkInterface.addMinutes(song, 3);
        artWorkInterface.describe(book);
        artWorkInterface.describe(song);
    }
}
