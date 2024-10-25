import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Playlists {
    public static void main(String[] args)throws FileNotFoundException {
        // User input scanner
        /* YOUR CODE GOES HERE :D */

        // Initializing playlists
        String popPlaylist = "------Pop Playlist!------"; 
        String regionalPlaylist = "-----Regional Playlist-----";
        String hiphopPlaylist = "------HipHop Playlist-----";
        String dancePlaylist = "-----Dance Playlist------";

        // initializing the Averages for the playlist using a method...
        int avgPop = PlaylistExtra.calculateAverageRating(popPlaylist);
        int avgReg =PlaylistExtra.calculateAverageRating(regionalPlaylist);
        int avgHip =PlaylistExtra.calculateAverageRating(hiphopPlaylist);
        int avgDan = PlaylistExtra.calculateAverageRating(dancePlaylist);

        System.out.println(PlaylistExtra.addToPlaylist(popPlaylist));
        System.out.println(""); // I know i could use "+/n" in my previous line but it helps that the lines have indentation
        System.out.println("The average integer rating for the playlist was: "+ avgPop);
        System.out.println("");
        System.out.println(PlaylistExtra.addToPlaylist(regionalPlaylist));
        System.out.println("");
        System.out.println("The average integer rating for the playlist was: "+ avgReg);
        System.out.println("");
        System.out.println(PlaylistExtra.addToPlaylist(hiphopPlaylist));
        System.out.println("");
        System.out.println("The average integer rating for the playlist was: "+ avgHip);
        System.out.println("");
        System.out.println(PlaylistExtra.addToPlaylist(dancePlaylist));
        System.out.println("");
        System.out.println("The average integer rating for the playlist was: "+ avgDan);
        System.out.println("");
        System.out.println("The highest average rated genre was: " +PlaylistExtra.determineFavoriteGenre(avgPop,avgHip,avgDan,avgReg));
        //The determine favoriteGenre relies specifically upon the order to be exact, otherwise it would print wrong
        // But, it's able to find the highest rating via comparison.
    }
}
