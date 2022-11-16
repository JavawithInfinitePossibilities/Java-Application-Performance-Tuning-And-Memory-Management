/**
 * 
 */
package com.sid.tutorials.performance.tuning.memory.management;

/**
 * @author Lenovo
 *
 */
public class Section06MemoryExercise1 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Section06MemoryExercise1 main = new Section06MemoryExercise1();
    main.start();
  }

  public void start() {
    String last = "Z";
    Container container = new Container();
    container.setInitial("C");
    another(container, last);
    System.out.print(container.getInitial());// B
  }

  public void another(Container initialHolder, String newInitial) {
    newInitial.toLowerCase();
    initialHolder.setInitial("B");
    Container initial2 = new Container();
    initialHolder = initial2;
    System.out.print(initialHolder.getInitial());// A
    System.out.print(newInitial);// Z
  }
}
