//Students Lab - APCS Array List Lab 

import java.io.*;
import java.util.*;

 
public class StudentsLab {
   public static void main(String args[])throws FileNotFoundException {
   //Create an ArrayList of the names in our class (Strings are objects)
   // If you are using Scanner with a name with a space use nextLine()
      ArrayList<String> arrOfNames = new ArrayList<String>();
      Scanner inputFile= new Scanner(new File ("class names.txt"));
      while (inputFile.hasNextLine()){
         String name=inputFile.nextLine();
         name=name.trim();
         arrOfNames.add(name);
      }
      
     //	Use the size method print out the size of the ArrayList
      System.out.println("There are "+arrOfNames.size()+" names in this class");
      printList(arrOfNames);
      removeCh(arrOfNames, 'J');
      System.out.println("\n J was removed\n");
      printList(arrOfNames);
      String [] additionalNames= {"Anna","Benny","Olaf","Seth"};
      addArray(arrOfNames, additionalNames);
      System.out.println("\n With new names\n");
      printList(arrOfNames);
      String oldNm= "Alice";
      String newNm= "**some name**";
      replaceName(arrOfNames, oldNm,newNm);
      System.out.println("\n Replacing "+ oldNm+ " with "+newNm);
      printList(arrOfNames);
   
      arrOfNames=removeDup(arrOfNames);
      System.out.println("\n WITHOUT DUPLICATES");
      printList(arrOfNames);
   //Finally using Collections.sort to put all the first names
   // in alphabetical order.  Strings already have a compareTo() method.
      Collections.sort(arrOfNames);
      System.out.println("\n\nALL NAMES IN ORDER: ");
   
      printList(arrOfNames);
   
   }
   
   //Write a method to printList() to print out the list numbered vertically
   public static void printList(ArrayList<String> x){
      for (int i = 0; i<x.size();i++){
         System.out.println(i+") " + x.get(i));
      }
   }
   //Write a method to delete all names that start with a given character
  //Be careful of duplicates.
   public static void removeCh(ArrayList<String> x, char ch){
   for (int i = 0; i<x.size(); i++){
      if (x.get(i).charAt(0) == ch){// && y.indexOf(x.get(i)) == -1){
          x.remove(i);
         i--;
      } 
   }
}
   
   
//Write a method to add all the elements in a String array to the ArrayList
   public static void addArray(ArrayList<String> x, String[]names){
      for (int i = 0; i<names.length; i++)
         x.add(names[i]);
   }
   //Write a method to replace a given name with another name
   public static void replaceName(ArrayList<String> x, String oldOne,String newOne){
       for (int i = 0; i<x.size(); i++){
         if (x.get(i).equals(oldOne))
            x.set(i, newOne);
      }
   }
          //	Write a method to remove duplicates
   public static ArrayList <String> removeDup(ArrayList<String> x) {
      for (int i = 0; i<x.size(); i++){
         if (x.indexOf(x.get(i)) != i){
            x.remove(i);
            i--;
         } 
      }
      return x;
   }

}
