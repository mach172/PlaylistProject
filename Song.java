/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song{
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private int length;
    private boolean isLiked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song(String myName, String myArtist, int myLength, boolean myIsLiked){
        name = myName;
        artist = myArtist;
        length = myLength;
        isLiked = myIsLiked;
    }


     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

     public String getName(){
        return name;
     }

     public String getArtist(){
        return artist;
     }

     public int getLength(){
        return length;
     }

    public String time(){
         return (length / 60) + ":" + (length % 60);
    }

     public boolean getLiked(){
        return isLiked;
     }

     public void likeSong(){
        isLiked = true;
    }
     
    public void dislikeSong(){
         isLiked = false;
    }

    public String toString(){
         if(isLiked){
            return "Song name: " + name + "\n" + 
            "Artist: " + artist + "\n" + 
            "Song length: " + (length / 60) + ":" + (length % 60) + "\n" + 
            "Song is liked";
         }
         else{
            return "Song name: " + name + "\n" + 
            "Artist: " + artist + "\n" + 
            "Song length: " + (length / 60) + ":" + (length % 60) + "\n" + 
            "Song is not liked";
         }

    }

}
