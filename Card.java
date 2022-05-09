public class Card extends Deck{
  public String value;
  public String suite;
  public String card;
  //public int finalValue;
  
  public Card(int seed){
    //are we not supposed to use this or what?
    //I just replaced makeCard with this stuff and returned the object in that method.
    super();
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) value = SPECIALS[n-BASE];
    
    this.suite = SUITES[s];
    this.value = val;

    
  }

  public String toString(){
    return this.suite + this.value;
  }
}