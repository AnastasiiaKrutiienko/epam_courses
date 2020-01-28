package com.epam.lesson6;

public class Book {
    private int id;
    private String nameOfBook;
    private String author;
    private String publishingHouse;
    private int yearOfPublish;
    private int amountOfPages;
    private double price;

    public Book(
        int id,
        String nameOfBook,
        String author,
        String publishingHouse,
        int yearOfPublish,
        int amountOfPage,
        double price
    ) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.amountOfPages = amountOfPage;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println(
            id + " - id," +
            nameOfBook + " - name, " +
            author + " - author," +
            publishingHouse + " - house, " +
            yearOfPublish + " - year, " +
            amountOfPages + " - amout, " +
            price + " - price, "
        );
    }
}
