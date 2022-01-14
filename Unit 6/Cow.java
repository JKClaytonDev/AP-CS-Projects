public class Cow extends Animal{ // keyword “extends” makes this a subclass
// no instance variables; all are inherited from Animal 
/** 
* Constructor for objects of class Cow 
* Takes two parameters for the cow's name and sound. 
*/ 
Cow(String newName, String newSound) 
{ // initialize inherited instance variables using the 
// superclass’ constructor 
super(newName, newSound); 
} 
// no methods needed; all are inherited from Animal 
} 
