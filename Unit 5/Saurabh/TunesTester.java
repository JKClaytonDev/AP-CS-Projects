public class TunesTester
 {
   public static void main(String[] args)
    {
     Song s1 = new Song("Yellow", "Cold Play", 2.4);
     Song s2 = new Song("Clocks", "Cold Play", 3.56);
     System.out.println(s2);
     Playlist p = new Playlist("ColdPlayHits");
     if(p.addSong(s1))System.out.println(s1+" added");;
     if(p.addSong(s2))System.out.println(s2+" added");;
     System.out.println( p.totalSongs());
     System.out.println( p.playlistTime());
     if(p.removeSong(s2))System.out.println(s2+" deleted");;
      System.out.println( p.totalSongs());
      p.addSong(s2);
     if( p.isSongInPlaylist("clocks"))// not case-sensative
        System.out.println("clocks is in the playlist");
     else 
      System.out.println("clocks is not in the playlist");
      p.songsByArtist( "Cold Play"); // all info
      p.songsByArtist("Grease Monkey");
      Song s3 = new Song("Around the Sun", "REM", 4.30);
      Playlist favorites = new Playlist("favorites");
      if(favorites.addSong(s3))System.out.println(s3+" Added");;
      if(favorites.addSong(s1))System.out.println(s1+" Added");;
      if(favorites.addSongsFrom(p))System.out.println(p+" Added");;
      System.out.println("Favorites: " + favorites.getList()); //getList() returns List<Song> type and toString() in ArrayList class prints the list contents
      if(favorites.addSongsFrom(favorites))System.out.println("Added songs from playlist " + favorites.playlistName());;
      Playlist q = new Playlist("duplicate");
      for (int i = 0; i<favorites.getList().size(); i++)
         q.addSong(favorites.getList().get(i));
      Song s4 = new Song("ABC Song", "David Letterman", 1.23);
      if(favorites.addSongsFrom(q))System.out.println("Added songs from playlist \"" + q.playlistName()  +"\"");;
      q.addSong(s4);
      Song s5 = new Song("Ode to DEF", "Donald Ladderman", 4.56);
      q.addSong(s5);
      Song s6 = new Song("GHI the Musical Soundtrack", "Joey Charguy", 7.89);
      q.addSong(s6);
      if(favorites.addSongsFrom(q))System.out.println("Added songs from playlist \"" + q.playlistName()  +"\"");;
      q.addSong(s4);
      if(favorites.addSongsFrom(q))System.out.println("Added songs from playlist \"" + q.playlistName()+"\"");;
      System.out.println(q.playlistName() + ": " + q.getList());
      System.out.println(favorites.playlistName() + ": " + q.getList());
      
     }
   }
