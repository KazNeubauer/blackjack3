import java.util.UUID;

public class Game{

  //for this object, refer to the inPlay, showWinner, addCard, printHand, and getTotal methods
  private Player[] players;
  private Player   dealer;
  private Deck     deck   = new Deck();
  private UUID     id     = UUID.randomUUID();
  
  public Game(){
    

  }


  /*public static String dealCard(String[] cards) {
    String card = "";
    for (int i = 0; i < cards.length; i++) {
      card = cards[i];
      if (card.length() > 0) {
        cards[i] = "";
        return card;
      }
    }
    return card;
  }*/

}