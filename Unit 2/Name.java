public class Name{
   private String firstName, middleName, lastName;
   public Name(String first, String middle, String last){
      firstName = first;
      middleName = middle;
      lastName = last;
   }
   public String getFirst(){
      return firstName;
   }
   public String getMiddle(){
      return middleName;
   }
   public String getLast(){
      return lastName;
   }
   public String firstMiddleLast(){
      return(firstName+" "+middleName+" "+lastName);
   }
   public String lastFirstMiddle(){
      return(lastName+", "+firstName+" "+middleName);
   }
   public boolean equals(Name otherName){
      return ((firstName+" "+middleName+" "+lastName).equalsIgnoreCase(otherName.firstMiddleLast()));
   }
   public String initials(){
      int firstOffset = 0;
      int secondOffset = 0;
      int lastOffset = 0;
      while (firstName.charAt(firstOffset) == ' ')
         firstOffset++;
         
      while (middleName.charAt(secondOffset) == ' ')
         secondOffset++;
         
      while (lastName.charAt(lastOffset) == ' ')
         lastOffset++;
         
      String initials = (firstName.charAt(firstOffset)+"."+middleName.charAt(secondOffset)+"."+lastName.charAt(lastOffset));
      return(initials.toUpperCase());
   }
   public int length(){
      int lengthOffset = 0;
      String noSpaces = this.firstMiddleLast();
      for (int i = 0; i<=noSpaces.length()-1; i++){
         if (noSpaces.charAt(i) == ' ')
            lengthOffset++;
      }
      return (noSpaces).length()-lengthOffset;
   }
      

}