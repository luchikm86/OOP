package com.mluch.oop.lesson4.hw.Messanger;

public class EmoticonText {
  // по стрингу можно сделать интерфейс и где есть стринг то нужно добавить в обьект ингтерфес
  private finaly String emoticon;
  
  public EmoticonText (String emoticon) {
   this.emoticon =  emoticon;
  }
  
  public string getEmoticon () {
   return emoticon; 
  }
  
  public String toString () {
   return "EmoticonText {" +
     "emoticon= " + emoticon +
     "}"; 
  }
}
