public class Deck{
  
  static final String[] SUITES    = {"♠","♥","♦","♣"};
  static final String[] SPECIALS  = {"A","J","Q","K"};
  static final int      BASE      = 9;
  static final int      SIZE      = 52;

  private Card[] cards;

  //what is this, this makes literally no sense with Card.java
  public Deck(){
    this.cards = new Card[SIZE];
  }
}