package com.sid.tutorials.performance.tuning.memory.management;

import java.util.Objects;

public class Book {
  private int id;
  private String title;
  private String author;
  private Double price;

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Book(int id, String title, String author, Double price) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String toString() {
    return title + " by " + author;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  /*
   * @Override public int hashCode() { return Objects.hash(author, id, price, title); }
   * 
   * @Override public boolean equals(Object obj) { if (this == obj) return true; if (obj == null)
   * return false; if (getClass() != obj.getClass()) return false; Book other = (Book) obj; return
   * Objects.equals(author, other.author) && id == other.id && Objects.equals(price, other.price) &&
   * Objects.equals(title, other.title); }
   */


}
