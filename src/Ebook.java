public class Ebook extends Book {
    private double fileSize;

    public Ebook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    public String toString() {
        return super.toString() + " fileSize: " + fileSize;

    }
}