import java.util.*;  
public class Playlist{
  
  //Instance variable
   private List<Song> songs;  //arraylist of songs
   private String name; //Playlist name
  
  
   public Playlist(String name){ 
      songs = new ArrayList<Song>();  //initalize Arraylist to hold Song type
      this.name = name;
   }
  
  //Methods:

 //Returns the playlist name
   public String playlistName(){
      return name;   
   }

  //adds Song s to Playlist
   public boolean addSong(Song s){
      return songs.add(s); 
   }
  
  //return list. Note return is List<Song>.
   public List<Song> getList(){
      return songs;
   }
  
   public int totalSongs(){//Returns the number of songs in the playlist. 
      return songs.size();
   }
   public double playlistTime(){ // Computes the total duration of the Playlist 
      double time = 0.0;
      for (int i = 0; i<songs.size(); i++)
         time+=songs.get(i).getPlayTime();
      return time;
   }
   public boolean isSongInPlaylist(String name){//Searches for particular song in the playlist. If found return true 
      for (int i = 0; i<songs.size(); i++){
         if (songs.get(i).getSongName().equals(name))
            return true;
      }
      return false;
   }
   public void songsByArtist(String name){//Displays/Prints all songs by the artist if the artist is found in the playlist
      for (int i = 0; i<songs.size(); i++){
         if (songs.get(i).getArtist().equals(name))
            System.out.println(songs.get(i).getSongName());
      }
   } 
   public boolean addSongsFrom(Playlist p){//Add (append) songs from Playlist p toend of this playlist.
      boolean added = false; 
      for (int i = 0; i<p.getList().size(); i++){
         if (songs.indexOf(p.getList().get(i)) == -1){
            songs.add(-000.getList().get(i));`1            added = true;
         }      }
      return added;
   }
   public boolean removeSong(Song s){
      boolean removed = false;
      for (int i = 0; i<songs.size(); i++){
         if (songs.get(i) == s){
            songs.remove(i);
            i--;
            removed = true;
         }
      }
      return removed;
   }
   public String toString(){
      return this.name;
   }
//ArrayList can allow duplicates i.e. list can have two entries for the same object. 
//Bonus points: Implement addSongsFrom such that playlist does not contain duplicate entries for the same song. 

}//end of class Playlist
