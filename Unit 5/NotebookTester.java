public class NotebookTester{
   public static void main (String[] arms){
      Notebook book;
      book = new Notebook();
      book.storeNote("one");
      book.storeNote("two");
      book.storeNote("three");
      book.storeNote("this is a non-urgent note");
      book.storeNote("this note is also not urgent");
      book.listNotes();
      message("storing urgent note...");
      book.storeUrgentNote("Remember to study for exam!");
      book.listNotes();
      message("removing note 6...");
      book.removeNote(5);
      book.listNotes();
      message("demoting note 1...");
      book.demoteNote(0);
      book.listNotes();
      message("swapping note 2 with note 3...");
      book.swapNotes(1);
      book.listNotes();
      message("here are the urgent notes:");
      book.listUrgentNotes();
      message("storing another urgent note...");
      book.storeUrgentNote("Please remember to study for exam!");
      book.listNotes();
      message("storing another urgent note...");
      book.storeUrgentNote("Please don't remember to study for exam!");
      book.listNotes();
      message("swapping note 1 with note 2...");
      book.swapNotes(0);
      book.listNotes();
      message("swapping note 2 with note 3...");
      book.swapNotes(1);
      book.listNotes();
   }
   public static void message(String s){
      System.out.println("\n"+s+"\n");
   }
}