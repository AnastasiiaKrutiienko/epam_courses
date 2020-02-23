package com.epam.lesson8;

import java.util.Scanner;
import java.lang.Exception;

public class Validator {

  public static int validationOfDiscount(Scanner scannerOfDiscount) {
    try {
      if (!scannerOfDiscount.hasNextInt()) {
        throw new Exception( "The data is not a number ");
      }

      if (scannerOfDiscount.nextInt() < 1) {
        throw new Exception( "The number is less than 1");
      }

      if (scannerOfDiscount.nextInt() > 99) {
        throw new Exception( "The number is more than 99");
      }
    } catch(Exception ex){
      System.out.println(ex.getMessage());
    }

    return scannerOfDiscount.nextInt();
  }

  public static int validationOfYear(Scanner scannerOfYear) {
    try {
      if (!scannerOfYear.hasNextInt()) {
        throw new Exception( "The data is not a number ");
      }

      if (scannerOfYear.nextInt() < 1900) {
        throw new Exception( "The year is earlier than 1900");
      }

      if (scannerOfYear.nextInt() > 2020) {
        throw new Exception( "The year is later than 2020");
      }
    } catch(Exception ex){
      System.out.println(ex.getMessage());
    }

    return scannerOfYear.nextInt();
  }

  public static String  validationOfAuthor(Scanner scannerOfAuthor) {
    try {
      if (!scannerOfAuthor.hasNextLine()) {
        throw new Exception("The data is not a text ");
      }
    } catch (Exception ex){
      System.out.println(ex.getMessage());
    }

    return scannerOfAuthor.nextLine();
  }
}
