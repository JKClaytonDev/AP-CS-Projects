import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
*/
public class Notebook
{
    // Storage for an arbitrary number of notes.
   private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
   public Notebook()
   {
      notes = new ArrayList<String>();
   }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
   public void storeNote(String note)
   {
      notes.add(note);
      checkNotes();
   }
   public void storeUrgentNote(String note){
      notes.add(0, "Urgent: " + note);
      checkNotes();
   }
    /**
     * @return The number of notes currently in the notebook.
     */
   public int numberOfNotes()
   {
      return notes.size();
   }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
   public void removeNote(int noteNumber)
   {
      if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
      }
      else if(noteNumber < numberOfNotes()) {
            // This is a valid note number.
         notes.remove(noteNumber);
      }
      else {
            // This is not a valid note number, so do nothing.
      }
      checkNotes();
   }

    /**
     * List all notes in the notebook.
     */
   public void checkNotes(){
      boolean urgent = true;
      int i = 0;
      for(String note : notes) {
         if (note.length() < 7 || !note.substring(0, 8).equals("Urgent: "))
            urgent = false;
         if (note.length() >= 7){
            if (!urgent && note.substring(0, 8).equals("Urgent: ")){
               notes.set(i, note.substring(8, note.length()));
            }
         }
         i++;
      }
   }
   public void listNotes()
   {
      checkNotes();
      int i = 0;
      for(String note : notes) {
         i++;
         System.out.println(i+") "+note);
      }
   }
    
   public void listUrgentNotes()
   {
      checkNotes();
      int i = 0;
      for(String note : notes) {
         if (note.length() >= 7){
            if (note.substring(0, 8).equals("Urgent: ")){
               i++;
               System.out.println(i+") "+note);
            }
         }
      }
   }
    
   public void demoteNote(int i){
      if (notes.size() <= i)
         return;
      storeNote(notes.get(i));
      removeNote(i);
      checkNotes();
   }
    
   public void swapNotes(int i){
      if (notes.size() <= i+1)
         return;
      String temp = notes.get(i);
      notes.set(i, notes.get(i+1));
      notes.set(i+1, temp);
      checkNotes();
   }
}
