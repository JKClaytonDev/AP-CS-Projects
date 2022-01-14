public class Letter {
/**Simple class for representing a basic letter.
 */
/**The name of the letter's sender.*/
private String sender;

/**The contents of the letter.*/
private String message;

/**Creates a letter object.
 * @param name The sender's name.
 * @param text The letter's contents.
 */
public Letter(String name, String text){
   sender = name;
   message = text;
}
/**Returns the name of the letter's sender. */
public String getSender(){
   return sender;
}
/**Returns the contents of the letter. */
public String getMsg(){
   return message;
}
}
