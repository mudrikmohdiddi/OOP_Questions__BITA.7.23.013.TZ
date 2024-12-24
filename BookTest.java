public class BookTest {
    public static void main(String[] args) {
    Book[] books = new Book[30];
    for(int i = 0;i<30;i++){

         books[i] =new Book("name"+i, "ISBN"+i, "author"+i, "publisher"+i);
        System.out.println(books[i].getBookInfo());
    }
}
}
