/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Section12MonitoringTheHeap {

  /**
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    CustomerManager cm = new CustomerManager();
    GenerateCustomerTask generateTask = new GenerateCustomerTask(cm);
    ProcessCustomerTask processTask = new ProcessCustomerTask(cm);

    for (int user = 0; user < 10; user++) {
      Thread t = new Thread(generateTask);
      t.start();
    }
    Thread t = new Thread(processTask);
    t.start();

    // main thread is now acting as the monitoring thread
    while (true) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      cm.howManyCustomers();
      System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");

    }
  }

}
