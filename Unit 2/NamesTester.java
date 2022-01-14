public class NamesTester{
   public static void main (String[] args){
      Name michelle = new Name("Michelle Suzanne", "Reaves", "Taylor");
       Name michelle2 = new Name("Michelle", "Suzanne", "Reaves Taylor");

      returnNames(michelle);
      Name scott = new Name("Scott", "Richard John", "Hogan");
      returnNames(scott);
      Name jake = new Name("Jake", "Alexander Thomas", "Mitchell");
      returnNames(jake);
      Name jakey = new Name("jaKE", "aLExander Thomas", "MITCHell");
      returnNames(jakey);
      System.out.println("\nDoes name 1 equal name 2? The answer is: "+michelle.equals(michelle2));
      System.out.println("\nDoes name 1 equal name 2? The answer is: "+scott.equals(michelle));
      System.out.println("Does name 1 equal name 3? The answer is: "+scott.equals(jakey));
      System.out.println("Does name 2 equal name 3? The answer is: "+michelle.equals(jakey));
      System.out.println("Does name 2 equal name 4? The answer is: "+jake.equals(jakey));
   }
   public static void returnNames(Name input){
      System.out.println("\nMy full name is "+input.firstMiddleLast() + ".");
      System.out.println("My name (last, first, Middle) is: " + input.lastFirstMiddle() + ".");
      System.out.println("My initials are: " + input.initials()+" .");
      System.out.println("My name is " +input.length() + " letters long.");
   }
}