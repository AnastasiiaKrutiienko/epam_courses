package com.epam.lesson6;

public class Main {
    public static void main(String[] arg) {
        Books books = new Books(5);
        books.addNewBook(new Book(
                1,
                "the three musketeers",
                "dumas",
                "ebury press",
                2014,
                450,
                250
        ));
        books.addNewBook(new Book(
                2,
                "the prince of thieves",
                "dumas",
                "reginetta press",
                2013,
                20,
                190
        ));
        books.addNewBook(new Book(
                3,
                "notre-dame de paris",
                "hugo",
                "hard press",
                2006,
                40,
                230
        ));
        books.addNewBook(new Book(
                4,
                "marie tudor",
                "hugo",
                "penguin books",
                2016,
                90,
                210
        ));
        books.addNewBook(new Book(
                5,
                "the human comedy",
                "balzac",
                "nyrb classics",
                2014,
                1000,
                270
        ));

        books.printBooks();
        books.changePrice();
        books.findAuthor();
        books.findByYear();

    }
}
