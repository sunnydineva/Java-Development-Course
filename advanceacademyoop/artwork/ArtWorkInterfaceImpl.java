package advanceacademyoop.artwork;

public class ArtWorkInterfaceImpl implements ArtWorkInterface {


    @Override
    public void describe(ArtWork artWork) {
        if(artWork instanceof Book){
            System.out.println(artWork.getTitle() + artWork.getAuthor() + " " + ((Book) artWork).getPages());
        } else if(artWork instanceof Song){
            System.out.println(artWork.getTitle() + artWork.getAuthor() + " " + ((Song) artWork).getMinutes());
        }
    }

    @Override
    public void addPages(Book book, int pages) {
        int currentPages = book.getPages();
        book.setPages(currentPages + pages);
    }

    @Override
    public void addMinutes(Song song, int minutes) {
        int currentMinutes = song.getMinutes();
        song.setMinutes(currentMinutes + minutes);
    }
}
