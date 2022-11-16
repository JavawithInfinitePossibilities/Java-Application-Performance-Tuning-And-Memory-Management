/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class Section09TheMetaspaceAndInternalJVMMemoryOptimisations {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Container container1 = new Container();
    container1.setInitial("J");
    Container container2 = new Container();
    container2.setInitial("K");

    Map<Container, String> map = new HashMap<Container, String>();
    map.put(container1, "X");
    map.put(container2, "Y");
    System.out.println("Map value before the making change in the container1 : " + map);

    Container container3 = container1;

    container1 = new Container();
    container1.setInitial("L");
    System.out.println("Map value before the making change in the container1 : " + map);
    System.out.println("Getting the value using container3 : " + map.get(container3));
    System.out.println("Getting the value using container1 : " + map.get(container1));

    System.out.println("---------------------------------------------------");
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
