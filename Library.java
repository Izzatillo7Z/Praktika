import java.util.Scanner;

public class Library {
    private Book[][][][] books = new Book[3][30][6][10];

    public void add(int floor, int closet, int shelf, int index, Book book) {
        books[floor][closet][shelf][index] = book;
    }
    public boolean contains(int floor, int closet, int shelf, int index) {
        return books[floor][closet][shelf][index] != null;

    }
    public String getBooks(int floor, String closetCode){
        String numericPart = closetCode.replace("C", "");
        int closetNumber = Integer.parseInt(numericPart);
        int closetIndex = closetNumber - 1;
        StringBuilder result = new StringBuilder();
        for (int shelf = 0; shelf < 6; shelf++) {
            result.append("Shelf ").append(shelf + 1).append("\n");
            for (int bookIndex = 0; bookIndex < 10; bookIndex++) {
                Book currentBook = books[floor][closetIndex][shelf][bookIndex];
                if (currentBook != null) {
                    result.append(currentBook.toString()).append("\n");
                }
            }
        }
        return result.toString();
    }
    public Book find(Book bookToFind){
        for (int floor = 0; floor < 3; floor++) {
            for (int closet = 0; closet < 30; closet++) {
                for (int shelf = 0; shelf < 6; shelf++) {
                    for (int index = 0; index < 10; index++) {
                        Book currentBook = books[floor][closet][shelf][index];
                        if (currentBook != null && currentBook.getAuthor().equals(bookToFind.getAuthor()) && currentBook.getTitle().equals(bookToFind.getTitle())){
                            return currentBook;
                        }
                    }
                }
            }
        }
        return null;
    }

}
