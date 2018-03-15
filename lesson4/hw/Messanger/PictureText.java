package com.mluch.oop.lesson4.hw.Messanger;

public class PictureText {
  
  private finaly String picture;
  
  public PictureText (String picture) {
   this.picture = picture; 
  }
  
  public String getPicture () {
   return picture; 
  }
  
  public String toString() {
   return "PictureText {" +
     "picture= " + picture +
     "}";
  }
  
}
