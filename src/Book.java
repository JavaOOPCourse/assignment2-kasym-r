public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        isAvailable = true;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book was successfully borrowed!");
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    void returnBook() {
        if (isAvailable){
            System.out.println("Book is already in the library!");
        }else {
            isAvailable = true;
            System.out.println("Book was successfully returned!");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author + " Year: " + year + " Available: "+ isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author) && this.year == other.year;
    }
}
