package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 10);
        books[1] = new Book("Java 8", 5);
        books[2] = new Book("ProGit", 1);
        books[3] = new Book("Murphy Grammar", 4);
        for (int i = 0; i < books.length; i++) {
            System.out.printf(System.lineSeparator() + "The title of the book is \"%s\" Number of books is %d ", books[i].getName(), books[i].getCount());
        }
        System.out.println(System.lineSeparator() + "Replace titles");
        Book t = books[0];
        books[0] = books[3];
        books[3] = t;
        for (int i = 0; i < books.length; i++) {
            System.out.printf(System.lineSeparator() + "The title of the book is \"%s\" Number of books is %d ", books[i].getName(), books[i].getCount());
        }
        System.out.println(System.lineSeparator() + "Output CleanCode");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == "Clean code") {
                System.out.printf(System.lineSeparator() + "The title of the book is \"%s\" Number of books is %d ", books[i].getName(), books[i].getCount());
            }
        }
    }
}
