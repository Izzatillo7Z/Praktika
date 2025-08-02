public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();

       //1-shkafga O'tgan kunlarni qo'shamiz
        Book book1 = new Book("Abdulla Qodiriy", "O'tgan kunlar", 0, 0, 0, 0);
        myLibrary.add(1, 0, 0, 0, book1);

        //2-indexga kitob qo'shamiz
        Book book2 = new Book("Tohir Malik", "Shaytanat", 0, 0, 0, 1);
        myLibrary.add(0, 0, 0, 1, book2);


       // kitob bo'lsa true qaytaradi aksi bo'lsa false

        System.out.println("T2 sharti uchun testlar:");
        System.out.println("0-qavat, 0-shkaf, 0-javon, 0-o'rinda kitob bormi? -> " + myLibrary.contains(0, 0, 0, 0)); // Natija: true
        System.out.println("1-qavat, 0-shkaf, 0-javon, 0-o'rinda kitob bormi? -> " + myLibrary.contains(1, 0, 0, 0)); // Natija: false
        System.out.println();



        //qaysi shkafda qaysi kitob borligi

        System.out.println("T3 sharti uchun test:");
        System.out.println("1-qavatdagi 'C1' shkafidagi kitoblar:");
        String booksInCloset = myLibrary.getBooks(0, "C1");
        System.out.println(booksInCloset);
        System.out.println();


        //kitobni izlaymiz. Bpr bo'lsa qay joydaligini aniqlash uchun
        System.out.println("T5 sharti uchun testlar:");
        // Topilishi kerak bo'lgan kitob
        Book bookToFind1 = new Book("Abdulla Qodiriy", "O'tgan kunlar", 0, 0, 0, 0);
        Book foundBook1 = myLibrary.find(bookToFind1);
        if (foundBook1 != null) {
            System.out.println("Kitob topildi: " + foundBook1.getTitle() + " muallifi: " + foundBook1.getAuthor());
            System.out.println("Pozitsiyasi: Qavat " + foundBook1.getFloor() + ", Shkaf " + foundBook1.getCloset() + ", Javon " + foundBook1.getShelf() + ", O'rin " + foundBook1.getIndex());
        } else {
            System.out.println("Kitob topilmadi.");
        }

        // Bizda yo'q kitob bo'lsa topilmaganligini aytadi
        Book bookToFind2 = new Book("Nomalum avtor", "Beg'ubor lider", 0, 0, 0, 0);
        Book foundBook2 = myLibrary.find(bookToFind2);
        if (foundBook2 != null) {
            System.out.println("Kitob topildi: " + foundBook2.getTitle() + " muallifi: " + foundBook2.getAuthor());
        } else {
            System.out.println("Kitob topilmadi.");
        }
    }
}
