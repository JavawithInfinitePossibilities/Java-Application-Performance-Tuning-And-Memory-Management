/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Section20HowListsWorks {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Date start = new Date();

    List<Book> books = new ArrayList<Book>();
    for (int i = 0; i < 1000; i++) {
      books.add(new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99));
    }

    Date end = new Date();
    System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
    start = new Date();

    books = new ArrayList<Book>();
    for (int i = 0; i < 1000; i++) {
      books.add(0, new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99));
    }

    end = new Date();
    System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
  }

}
