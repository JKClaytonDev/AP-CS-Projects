public  class Animal { // instance variables 
   private String myName; // subclasses use getName() to access 
   private String mySound; 
       /** 
* Constructor for objects of class Animal 
*/ 
   Animal() // default (no argument) constructor blanks Sun, Sun // everything out 
   { 
      myName = ""; // initialize instance variables 
      mySound = ""; 
   } 
   Animal(String newName, String newSound) // constructor 
   // takes name and sound 
   { 
      myName = newName; // initialize instance variables 
      mySound = newSound; 
   } 
/** 
* Accessor methods 
* getName() returns this animal object's name 
*/ 
   String getName() 
   { 
      return myName; 
   } 
/** 
* Accessor methods 
* getSound() returns this animal object's sound 
*/ 
   String getSound() 
   { 
      return mySound; 
   } 
/** 
* toString() returns this animal object's information as a 
* String 
*/ 

   public String toString() 
   { 
      return myName + " says " + mySound; // send name,sound to the caller 
   } // end of toString() 
} // end of Animal superclass 
