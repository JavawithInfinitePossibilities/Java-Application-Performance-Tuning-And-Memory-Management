/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.Iterator;

/**
 * @author Lenovo
 *
 */
public class Section07EscapingReferences {

  /**
   * @param args
   */
  public static void main(String[] args) {
    CustomerRecords records = new CustomerRecords();

    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));

    /* records.getCustomers().clear(); */

    /* records.findCustomer("John").setName("Jane"); */

    for (ICustomer next : records.getCustomers().values()) {
      System.out.println(next);
    }
    System.out.println(records.findCustomer("John"));
    /*
     * for (Customer customer : records) { System.out.println(customer); }
     * 
     * Iterator<Customer> iterable = records.iterator(); iterable.next(); iterable.remove();
     * 
     * for (Customer customer : records) { System.out.println(customer); }
     */

  }

}
