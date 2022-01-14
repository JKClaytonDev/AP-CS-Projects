public class PostOfficeTester{
public static void main(String[] args)
 {
  PostOffice branch = new PostOffice(5);
  if (branch.retrieveMsg(5) != null)
  System.out.println("Retrieved message: " + branch.retrieveMsg(5));
  else
  System.out.println("Failed to retrieve message!");
  if (branch.placeLetter(new Letter("Arnold", "I'll be back!"), 5))
  System.out.println("Placed letter: " + branch.retrieveMsg(5));
  else
  System.out.println("Failed to place letter");
  
  if (branch.placeLetter(new Letter("Spock", "Live long and prosper."),4))
  System.out.println("Placed letter: " + branch.retrieveMsg(4));
  else
  System.out.println("Failed to place letter");

  if (branch.placeLetter(new Letter("Kirk", "KHAAAAAN!"),4))
  System.out.println("Placed letter: " + branch.retrieveMsg(4));
  else
  System.out.println("Failed to place letter");

  if (branch.retrieveMsg(4) != null)
  System.out.println("Retrieved message: " + branch.retrieveMsg(4));
  else
  System.out.println("Failed to retrieve message!");
  
  if (branch.retrieveMsg(2) != null)
  System.out.println("Retrieved message: " + branch.retrieveMsg(2));
  else
  System.out.println("Failed to retrieve message!");
  
  if (branch.retrieveMsg(-1) != null)
  System.out.println("Retrieved message: " + branch.retrieveMsg(-1));
  else
  System.out.println("Failed to retrieve message!");
 
   if (branch.placeLetter(new Letter("Harry", "Make my day!"),0))
  System.out.println("Placed letter: " + branch.retrieveMsg(0));
  else
  System.out.println("Failed to place letter");
  
     if (branch.placeLetter(new Letter("Ellie", "Thanks for the adventure! Now go have   another one!"), 1))
  System.out.println("Placed letter: " + branch.retrieveMsg(1));
  else
  System.out.println("Failed to place letter");
    
     if (branch.placeLetter(new Letter("Buzz", "To infinity... and beyond!"), 3))
  System.out.println("Placed letter: " + branch.retrieveMsg(3));
  else
  System.out.println("Failed to place letter");
  
     if (branch.placeLetter(new Letter("Puppy", "Vet appointment today!"), -3))
  System.out.println("Placed letter: " + branch.retrieveMsg(-3));
  else
  System.out.println("Failed to place letter");

  if (branch.findSender("Kirk") != null)
      System.out.println("Found a letter sent by " + branch.findSender("Kirk").getSender() + " : " + branch.findSender("Kirk").getMsg());
  else
      System.out.println("No letters from this sender found!");
  
  if (branch.findSender("Ellie") != null)
      System.out.println("Found a letter sent by " + branch.findSender("Ellie").getSender() + " : " + branch.findSender("Ellie").getMsg());
  else
      System.out.println("No letters from this sender found!");
  }
  }
