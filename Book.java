public class Book{
    private String bookName;
    private String ISBN_number;
    private String authorName;
    private String publisher;

    public Book(String bookName,String ISBN_number,String authorName,String publisher){
        this.bookName = bookName;
        this.ISBN_number = ISBN_number;
        this.authorName = authorName;
        this.publisher = publisher;
    }
    public void setbookName(String bookName){
        this.bookName = bookName;
    }
    public void setISBN_number(String ISBN_number){
        this.ISBN_number = ISBN_number;
    }
    public void setauthorName(String authorName){
        this.authorName = authorName;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    public String getbookName(){
        return this.bookName;
    }
    public String getISBN_number(){
        return this.ISBN_number;
    }
    public String getauthorName(){
        return this.authorName;
    }
    public String getpublisher(){
        return this.publisher;
    }
    public String getBookInfo(){
        return "\nThe book name is "+getbookName()+", ISBN number is "+getISBN_number()+", the author name is "+getauthorName()+" and publisher is "+getpublisher();

    }


}
