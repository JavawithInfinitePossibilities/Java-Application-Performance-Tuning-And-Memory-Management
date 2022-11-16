/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

/**
 * @author Lenovo
 *
 */
public class Section05PassingObjectsBetweenMethods {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int localVariable = 5;
    calculate(localVariable);
    System.out.println("Local variable : " + localVariable);
  }

  private static void calculate(int localVariable) {
    localVariable = localVariable * 100;
  }

}
