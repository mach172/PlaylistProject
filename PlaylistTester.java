/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here

        Playlist realmusic = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

        Song spaceOddity  = new Song("Space Oddity", "David Bowie", 318,false);

        Song theManWhoSoldTheWorld = new Song("The Man Who Sold the World", "Nirvana", 261, false);

        Song scarTissue = new Song("Scar Tissue", "Red Hot Chili Peppers", 215, false);

        Song santeria = new Song("Santeria", "Sublime", 182, false);

        Song silverSprings = new Song("Silver Springs", "Fleetwood Mac", 288, false);

        Song beastOfBurden = new Song("Beast of Burden", "The Rolling Stones", 265, false);

        realmusic.addSong(spaceOddity);
        realmusic.addSong(theManWhoSoldTheWorld);
        realmusic.addSong(scarTissue);
        realmusic.addSong(santeria);
        realmusic.addSong(silverSprings);
        realmusic.addSong(beastOfBurden);
            
     
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        realmusic.printPlaylist();

        System.out.println("\nLiking the songs in positions 1, 2, and 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        realmusic.likeSongPlaylist(1);
        realmusic.likeSongPlaylist(2);
        realmusic.likeSongPlaylist(4);

        System.out.println("Printing the songs...\n");
        realmusic.printPlaylist();

        System.out.println("\nRemoving the song in position 0\n");
        realmusic.removeSongPosition(0);

        System.out.println("Printing the songs...\n");
        realmusic.printPlaylist();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        realmusic.printLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println("Total duration: " + realmusic.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        realmusic.removeDislikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        realmusic.printPlaylist();
    }
}
