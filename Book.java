public class Book {
    private String author;
    private String title;
    private int floor;
    private int closet;
    private int shelf;
    private int index;

    public Book(String author, String title,int floor, int closet, int shelf, int index){
        this.title = title;
        this.author = author;
        this.floor = floor;
        this.closet = closet;
        this.shelf = shelf;
        this.index = index;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getFloor() {
        return floor;
    }

    public int getCloset() {
        return closet;
    }

    public int getShelf() {
        return shelf;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }

}
