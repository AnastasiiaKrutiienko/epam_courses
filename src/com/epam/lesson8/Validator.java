package com.epam.lesson8;

import java.util.Scanner;

public class Validator {

  public static int validationOfDiscount(Scanner scannerOfDiscount) {
    int number = 0;
    int min = 1;
    int max = 99;

    do {
      while (!scannerOfDiscount.hasNextInt()) {
        System.out.println("Discount should be a number");
        scannerOfDiscount.next();
      }

      number = scannerOfDiscount.nextInt();

      if (number < min || number > max)
        System.out.println("Discount should be in range from 1 to 99");

    } while (number < min || number > max);

    return number;
  }

  public static int validationOfYear(Scanner scannerOfYear) {
    int number = 0;
    int min = 1900;
    int max = 2020;

    do {
      while (!scannerOfYear.hasNextInt()) {
        System.out.println("Year should be a number");
        scannerOfYear.next();
      }

      number = scannerOfYear.nextInt();

      if (number < min || number > max)
        System.out.println("Year should be in range from 1900 to 2020");

    } while (number < min || number > max);

    return number;
  }

  public static String validationOfAuthor(Scanner scannerOfAuthor) {
    String author = scannerOfAuthor.nextLine();
    String regex = "[a-zA-Z]*";

    do {
      if (!author.matches(regex)) {
        System.out.println("The author name must contain only a-zA-Z characters");
        scannerOfAuthor.next();
      }
    } while (author.matches(regex));

    return author;
  }
}
