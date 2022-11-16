/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

/**
 * @author Lenovo
 *
 */
public class Section08MemoryExercise2 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // @formatter:off
    /*System.out.println("---START OF PROBLEM 1---");
    // Print out the current exchange rates
    System.out.println("The current exchange rates are USD 1 = ");
    Price price = new Price(1.0);
    price.getRates().forEach((k, v) -> System.out.println(k + " " + v));

    // PROBLEM 1 - can we change one of the rates?
    price.getRates().put("USD", 2d);
    System.out.println("The current exchange rates are USD 1 = ");
    price.getRates().forEach((k, v) -> System.out.println(k + " " + v));

    System.out.println("---END OF PROBLEM 1---");*/
    // @formatter:on
    BookCollection bc = new BookCollection();
    // @formatter:off
    /*System.out.println("---START OF PROBLEM 2---");

    // Get all the books printed out
    bc.printAllBooks();

    // PROBLEM 2 - can we change a book?
    IBook emma = bc.findBookByName("Emma");
    emma.setPrice(999d);
    bc.printAllBooks();

    System.out.println("---END OF PROBLEM 2---");*/
    // @formatter:on
    // @formatter:off
    System.out.println("---START OF PROBLEM 3---");
    // Print out the price of the book Tom Jones
    IBook book = bc.findBookByName("Tom Jones");
    System.out.println("Tom Jones costs USD " + book.getPrice());
    System.out.println("Tom Jones costs EUR " + book.getPrice().convert("EUR"));
    System.out.println("Tom Jones costs GBP " + book.getPrice().convert("GBP"));
    System.out.println("---END OF PROBLEM 3---");
    // @formatter:on
  }

}
