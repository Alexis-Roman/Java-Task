public class task11{
    public static void main(String[] args) {
        Book book1 = new Book("Attack on Titan", "Hajime Isayama",
                2009, 10.99);
        Book book2 = new Book("Java Programming", "John Smith",
                2021, 39.99);
        Book book3 = new Book("The Art of Electronics",
                "Paul Horowitz & Winfield Hill", 1980, 120.00);

        System.out.println(book1.toString());
    }
}

class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
}


