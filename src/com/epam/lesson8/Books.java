package com.epam.lesson8;

import java.util.Arrays;

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

    public void printBooks(Book[] printedBooks) {
        for (Book book : printedBooks) {
            System.out.println(book.toString());
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public Book[] changePrice(int discount) {
        double newPrice = 0.0;

        for (Book book : books) {
            double price = book.getPrice();
            newPrice = price * (1 - discount / 100.0);

            book.setPrice((int) newPrice);
        }

        return books;
    }

    public Book[] findAuthor(String author) {
        int matchCount = 0;

        for (Book book : books) {
            String currentAuthor = book.getAuthor();

            if (currentAuthor.equals(author)) {
                matchCount++;
            }
        }

        Book[] filteredByAuthor = new Book[matchCount];

        for (int i = 0, k = 0; i < books.length; i++) {
            String currentAuthor = books[i].getAuthor();

            if (currentAuthor.equals(author)) {
                filteredByAuthor[k] = books[i];
                k++;
            }
        }

        return filteredByAuthor;
    }

    public Book[] findByYear(int neededYear) {
        int matchCount = 0;

        for (Book book : books) {
            int yearOfPublishOfCurrentBook = book.getYearOfPublish();

            if (yearOfPublishOfCurrentBook >= neededYear) {
                matchCount++;
            }
        }

        Book[] filteredByYear = new Book[matchCount];

        for (int i = 0, k = 0; i < books.length; i++) {
            int yearOfPublishOfCurrentBook = books[i].getYearOfPublish();

            if (yearOfPublishOfCurrentBook >= neededYear) {
                filteredByYear[k] = books[i];
                k++;
            }
        }

        return filteredByYear;
    }

    public Book[] sortByAuthor(Book[] arrayOfBooks) {
        Book[] sortedByAuthor = Arrays.copyOf(arrayOfBooks, arrayOfBooks.length);
        Arrays.sort(sortedByAuthor, new AuthorComparator());

        return sortedByAuthor;
    }

    public Book[] sortByPublishingHouse(Book[] arrayOfBooks) {
        Book[] sortedByPublishingHouse = Arrays.copyOf(arrayOfBooks, arrayOfBooks.length);
        Arrays.sort(sortedByPublishingHouse, new PublishingHouseComparator());

        return sortedByPublishingHouse;
    }

    public Book[] sortByPrice(Book[] arrayOfBooks) {
        Book[] sortedByPrice = Arrays.copyOf(arrayOfBooks, arrayOfBooks.length);
        Arrays.sort(sortedByPrice, new PriceComparator());

        return sortedByPrice;
    }
}
