/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo <br/>
 * 
 *         <pre>
 *         Note : Make sure the built will be in JAR not in WAR
 *         Step-1: Navigate to the target folder <br/>
 *              cd path<br/>
 *         Step-2: run the below commend in a single line <br/>
 *              java -Xms300m -cp Section-11-Introducing-Garbage-Collection.jar
 *         com.sid.tutorials.performance.tuning.memory.management.Section11IntroducingGarbageCollection
 *         </pre>
 */
public class Section11IntroducingGarbageCollection {

  /**
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    Runtime runtime = Runtime.getRuntime();

    long availableBytes = runtime.freeMemory();
    System.out.println("Available memory at start: " + availableBytes / 1024 + "k");

    // let's create lots of objects....
    List<Customer> customers = new ArrayList<Customer>();

    for (int i = 0; i < 1000000; i++) {
      customers.add(new Customer("John"));
    }

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory  when customers created: " + availableBytes / 1024 + "k");

    customers = new ArrayList<>();

    availableBytes = runtime.freeMemory();
    System.out.println(
        "Available memory  when customers no longer referenced: " + availableBytes / 1024 + "k");

    Thread.sleep(1000);

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory  1 second later: " + availableBytes / 1024 + "k");

    System.gc();

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory  after GC command: " + availableBytes / 1024 + "k");
  }

}
