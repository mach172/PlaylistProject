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
    private ArrayList<Song> playList;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        playList = new ArrayList<Song>();
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

    public void removeSongPosition(int position){
        playList.remove(position);
    }

    public void removeSongSong(Song a){
        playList.remove(a);
    }

    public void printPlaylist(){
        for(Song a : playList){
            System.out.println(a.toString());
        }
    }

    public void printLikedSongs(){
        System.out.println("Liked songs: ");
        for(Song a : playList){
            if(a.getLiked()){
                System.out.println(a.toString());
            }
        }
    }

    public String totalDuration(){
        int duration = 0;
        for(Song a : playList){
            duration += a.getLength();
        }

        if((duration % 60) < 10){
            return (duration / 60) + ":" + "0" + (duration % 60);
        }
        else{
            return (duration / 60) + ":" + (duration % 60);
        }
    }

    public void removeDislikedSongs(){
        for(int i = playList.size()-1; i >= 0; i--){
            if(!(playList.get(i).getLiked())){
                playList.remove(i);
            }
        }
    }
}
