
class Card implements Comparable<Card>{  
   public Card(){
     name = "";
   }
   public Card(String n) {
    name = n;
   }
   public boolean isExpired(){
      return false;
   }
   public void print(){
      System.out.println("Card holder: " + name);
   }
   public String printName(){
      return("Card holder: " + name);
   }
   public boolean equals (Card c){
   return (c.compareTo(this) == 0);
   }
   public Object clone(){
      return this;
   }
   private String name;
   public int compareTo(Card o){
   return (o.name.compareTo(this.name));
   }
}
