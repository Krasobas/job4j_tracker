package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = {new Book("Java - The Complete Reference", 1248),
                        new Book("Head First Java", 720),
                        new Book("Head First Design Patterns", 694),
                        new Book("Clean code", 464)};
        Book temp;
        System.out.println("\nLibrary before replacement:");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - "
                        + books[index].getPages() + " pages.");
        }
        System.out.println("\nLibrary after replacement:");
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - "
                    + books[index].getPages() + " pages.");
        }
        System.out.println("\nDo you have \"Clean code\"?");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println("Book #" + (index + 1) + ": " + books[index].getName()
                        + " - " + books[index].getPages() + " pages.");
            }
        }

    }
}
