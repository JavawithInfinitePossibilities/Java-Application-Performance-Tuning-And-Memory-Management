/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class Section20HowMapsWorks {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Date start = new Date();
    Book book = new Book(1, "Jane Eyre", "Charlotte Bronte", 14.99);
    System.out.println(book.hashCode());
    Book book2 = new Book(2, "Jane Eyre", "Charlotte Bronte", 14.99);
    System.out.println(book2.hashCode());
    Map<Book, Double> books = new HashMap<>();
    for (int i = 0; i < 10000000; i++) {
      books.put(new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99), 14.99);
    }

    Date end = new Date();
    System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
  }

}
