package com.epam.lesson6;
import java.util.Scanner;

public class Books {
    private Book[] books;
    private int index = 0;

    public Books(int arrayLength) {
        this.books = new Book[arrayLength];
    }

    public void addNewBook(Book book) {
        this.books[this.index] = book;
        this.index++;
    }

    public void printBooks() {
        for (Book book : books) {
            book.view();
        }
    }

    public void changePrice() {
        System.out.println("Please, type the discount");
        Scanner sc = new Scanner(System.in);
        int discount = sc.nextInt();

        for (Book book : books) {
            double price = book.getPrice();
            double newPrice = price * (1 - discount / 100.0);

            book.setPrice((int) newPrice);
        }
    }

    public void findAuthor() {
        System.out.println("Please, type the author to find");
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();

        for (Book book : books) {
            String currentAuthor = book.getAuthor();

            if (currentAuthor.equals(author)) {
                book.view();
            }
        }
    }

    public void findByYear() {
        System.out.println("Please, type the year to find");
        Scanner sc = new Scanner(System.in);
        int neededYear = sc.nextInt();

        for (Book book : books) {
            int yearOfPublishOfCurrentBook = book.getYearOfPublish();

            if (yearOfPublishOfCurrentBook >= neededYear) {
                book.view();
            }
        }
    }
}
