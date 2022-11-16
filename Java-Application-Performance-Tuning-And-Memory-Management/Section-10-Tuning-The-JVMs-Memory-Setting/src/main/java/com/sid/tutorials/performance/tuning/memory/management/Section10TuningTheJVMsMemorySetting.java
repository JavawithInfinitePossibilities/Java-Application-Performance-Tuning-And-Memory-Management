/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

/**
 * @author Lenovo To run the below code in the commend prompt follow the below steps <br/>
 * 
 *         <pre>
 *         Note : Make sure the built will be in JAR not in WAR
 *         Step-1: Navigate to the target folder <br/>
 *              cd path<br/>
 *         Step-2: run the below commend in a single line <br/>
 *              java -XX:+PrintStringTableStatics -XX:StringTableSize=120121 -cp Section-10-Tuning-The-JVMs-Memory-Setting.jar
 *         com.sid.tutorials.performance.tuning.memory.management.Section10TuningTheJVMsMemorySetting
 *         </pre>
 */
public class Section10TuningTheJVMsMemorySetting {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String one = "hello";
    String two = "hello";

    System.out.println("one.equals(two) : " + one.equals(two));
    System.out.println("one == two : " + (one == two));

    System.out.println("Hash code of one : " + one.hashCode());
    System.out.println("Hash code of two : " + two.hashCode());

    Integer i = 76;
    String three = i.toString();
    /* String three = i.toString().intern(); */
    String four = "76";

    System.out.println("three.equals(four) : " + three.equals(four));
    System.out.println("three==four : " + (three == four));
  }

}
