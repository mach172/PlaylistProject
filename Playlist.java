import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playList = new ArrayList<Song>();


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(ArrayList<Song> playlistIn){
        playList = playlistIn;
    }
      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(Song songIn){
        playList.add(songIn);
    }

    public void likeSongPlaylist(int position){
        playList.get(position).likeSong();
    }

    public void removeSong(int position){
        playList.remove(position);
    }

    public void printPlaylist(){
        for(Song a : playList){
            System.out.println("Song name: " + a.getName());
            System.out.println("Artist: " + a.getArtist());
            System.out.println("Song length: " + a.time());
            if(a.getLiked()){
                System.out.println("Song is liked");
            }
            else{
                System.out.println("Song is not liked");
            }
        }
    }
}
