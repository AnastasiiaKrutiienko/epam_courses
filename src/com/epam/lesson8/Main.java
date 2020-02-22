package com.epam.lesson8;

import java.util.Scanner;

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

        books.printBooks(books.getBooks());
        System.out.println("Please, type the discount");
        Scanner scannerOfDiscount = new Scanner(System.in);
        int discount = scannerOfDiscount.nextInt();
        books.printBooks(books.changePrice(discount));

        System.out.println("Please, type the author to find");
        Scanner scannerOfAuthor = new Scanner(System.in);
        String author = scannerOfAuthor.nextLine();
        books.printBooks(books.findAuthor(author));

        System.out.println("Please, type the year to find");
        Scanner scannerOfYear = new Scanner(System.in);
        int year = scannerOfYear.nextInt();
        books.printBooks(books.findByYear(year));

    }
}
