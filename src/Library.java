public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("No available places");
        } else {
            books[count++] = book;
        }
    }

    public void displayBooks() {
        for(Book b : books) {
            if (b != null) {
                System.out.println(b.toString());
            }
        }
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b != null && b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        Book x = searchByTitle(title);
        if (x != null) {
            x.borrowBook();
        } else {
            System.out.println("book not found");
        }

    }

    public void returnBook(String title) {
        Book x = searchByTitle(title);
        if (x != null ){
            x.returnBook();

        }else{
            System.out.println("book not found");
        }
    }
}

