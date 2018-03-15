package com.mluch.oop.lesson4.hw.Messanger;

public class Message {
  
  private finaly String author;
  private finaly LocalDate locDate;
  private finaly String countent;
  
  public Message (String author, LocalDate locDate, String countent) {
    this.author = author;
    this.locDate = locDate;
    this.countent = countent;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public LocalDate locDate() {
    return locDate;
  }
  
  public String getCountent() {
    return countent;
  }
  
  public String toString() {
   return "Message{" + 
     "author= " + author +
     "locDate= " + locDate +
     "countent= " + countent +
     '}';
  }

}
