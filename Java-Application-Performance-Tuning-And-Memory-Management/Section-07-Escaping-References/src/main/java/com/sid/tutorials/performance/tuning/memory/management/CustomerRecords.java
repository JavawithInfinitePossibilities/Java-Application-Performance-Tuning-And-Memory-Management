package com.sid.tutorials.performance.tuning.memory.management;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
  private Map<String, Customer> records;

  public CustomerRecords() {
    this.records = new HashMap<String, Customer>();
  }

  public void addCustomer(Customer c) {
    this.records.put(c.getName(), c);
  }

  public Map<String, Customer> getCustomers() {
    /**
     * Java-7
     */
    /* return new HashMap<String, Customer>(this.records); */
    /**
     * Java-8 below
     */
    /* return Collections.unmodifiableMap(this.records); */
    /**
     * Java-10 and above
     */
    return Map.copyOf(this.records);
  }

  @Override
  public Iterator<Customer> iterator() {
    return this.records.values().iterator();
  }

  public ICustomer findCustomer(String name) {
    return new Customer(records.get(name));
  }

}
