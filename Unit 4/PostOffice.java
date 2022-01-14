public class PostOffice {
/**Class for representing letters in post office boxes by using an array of objects.
 */
   /**The array of Letters used to represent the post office boxes. */
   private Letter pobox[];
   
   /** Creates a new PostOffice object that has a number of post office boxes equal to size. 
    *  Each   post office box
    * is empty to begin with (i.e. contains null). The boxes are numbered from 0 to (size - 1).
    * @param size The number of post office boxes (i.e. the length of the Letter array).
    */
   public PostOffice(int size){
      pobox = new Letter[size];
   }
   /**Places a Letter in the post office box with the specified number and returns true.
    * Returns false if that post office box already contains a Letter or if there
    * exists no post office box with that number.
    * @param mail The Letter to be placed in the post office box.
    * @param boxNum The number of the post office box in which the Letter will be placed.
    */
   
   public boolean placeLetter(Letter mail, int boxNum){
      if (boxNum > 0 && boxNum < pobox.length && pobox[boxNum] == null){
         pobox[boxNum] = mail;
         return true;
         }
      return (false);
   }
   /**Returns the message contained within the Letter located in the specific box number.
    * Returns "Empty!" if the post office box specified by the integer does not contain a Letter.
    * Returns "Box does not exist!" if there is no box with the specified integer.
    * @param boxNum The post office box number to be checked.
    */
   
   public String retrieveMsg(int boxNum){
      if (boxNum >= 0 && boxNum < pobox.length && pobox[boxNum] != null && pobox[boxNum].getMsg() != null)
         return pobox[boxNum].getMsg();
         return null;
   }
   
   /** Returns the first Letter found that has a sender whose name matches the name
    * passed by the method's argument. Returns null if no Letter with a matching
    * sender is found.
    * @param name The name of the sender whose Letter will be found.
    */
   public Letter findSender(String name){
      for (Letter l : pobox){
         if (l != null && l.getSender() == (name))
            return l; 
       }
      return null;
   }
   
}
