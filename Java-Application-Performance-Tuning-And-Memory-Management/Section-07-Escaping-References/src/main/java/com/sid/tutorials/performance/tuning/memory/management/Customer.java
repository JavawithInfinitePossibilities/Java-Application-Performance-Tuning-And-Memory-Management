package com.sid.tutorials.performance.tuning.memory.management;

public class Customer implements ICustomer {
  private String name;

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer(Customer c) {
    this.name = c.name;
  }

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

}
