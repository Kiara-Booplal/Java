package ClassAndObjectsBasics.MiniLibrarySystem;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[6];

        books[0] = new Book();
        books[0].title = "Shatter Me";
        books[0].author = "TM";
        books[0].isAvailable = true;

        books[1] = new Book();
        books[1].title = "Great Gatsby";
        books[1].author = "Igloo";
        books[1].isAvailable = true;

        books[2] = new Book();
        books[2].title = "Ignite Me";
        books[2].author = "TM";
        books[2].isAvailable = false;

        books[3] = new Book();
        books[3].title = "Reveal Me";
        books[3].author = "TM";
        books[3].isAvailable = true;

        books[4] = new Book();
        books[4].title = "Believe Me";
        books[4].author = "TM";
        books[4].isAvailable = true;

        books[5] = new Book();
        books[5].title = "Deny Me";
        books[5].author = "TM";
        books[5].isAvailable = false;

        listAvailableBooks(books);
        System.out.println();
        borrowBook("Believe Me", books);
        System.out.println();
        listAvailableBooks(books);
        System.out.println();
        returnBook("Believe Me", books);
        System.out.println();
        listAvailableBooks(books);

    }

    public static void listAvailableBooks(Book[] books) {
        System.out.println("List of books available");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isAvailable) {
                System.out.println("Title: " + books[i].title + "  Author: " + books[i].author);
            }
        }
    }

    public static void borrowBook(String title, Book[] books) {
        boolean foundTitle = false;
        boolean isAvaliable = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                foundTitle = true;
                if (books[i].isAvailable) {
                    isAvaliable = true;
                    System.out.println("Book borrowed");
                    books[i].isAvailable = false;
                }
            }
        }
        if (foundTitle == false) {
            System.out.println("This book is can not be found");
        } else if (isAvaliable == false) {
            System.out.println("This book is currently unavailable");
        }
    }

    public static void returnBook(String title, Book[] books) {
        boolean booktitle = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                booktitle = true;
                books[i].isAvailable = true;
                System.out.println("Book returned");
            }
        }
        if(booktitle == false){
            System.out.println("This is not the book you borrowed");
        }
    }
}
