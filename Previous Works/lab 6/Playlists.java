import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Playlists {
    public static void main(String[] args)throws FileNotFoundException {
        // User input scanner
        Scanner userScanner = new Scanner(System.in);
        File likedSongs = new File("likedsongs.txt");
        Scanner songsScanner = new Scanner(likedSongs);
         

        // Initializing playlists
        String popPlaylist = "------Pop Playlist!------";
        String regionalPlaylist = "-----Regional Playlist-----";
        String hiphopPlaylist = "------HipHop Playlist-----";
        String dancePlaylist = "-----Dance Playlist------";

        // Initializing playlists sum of song ratings
        int rSumPop = 0;
        int rSumReg = 0;
        int rSumHip = 0;
        int rSumDan = 0;


        // Initializing playlists song count
        int totalPop = 0;
        int totalReg = 0;
        int totalHip = 0;
        int totalDan = 0;
 
        // Handle File Not Found Exception
        //try {

            // Traverse file and concatenate to corresponding playlists, update values to compute avg
            /* YOUR CODE GOES HERE :'j */
            while(songsScanner.hasNext() ){
                String songName = songsScanner.next();
                String artistName = songsScanner.next();
                String genre = songsScanner.next();
                int rating = songsScanner.nextInt();

                switch(genre){
                    case"Pop":
                            rSumPop++;
                            totalPop = totalPop + rating;
                        break;
                    case"Regional":
                            rSumReg++;
                            totalReg = totalReg + rating;
                        break;
                    case"HipHop":
                            rSumHip++;
                            totalHip = totalHip + rating;
                        break;
                    case"Dance":
                            rSumDan++;
                            totalDan = totalDan + rating;
                        break;
                }
            }

            // Compute average of each playlist and print
            int avgPop = totalReg/rSumPop;
            int avgReg = totalReg/rSumReg;
            int avgHip = totalHip/rSumHip;
            int avgDan = totalDan/rSumDan;


            // Compute max average
            int max = 0;
            String favorite = "Unknown";
            if( (avgPop>avgReg) && (avgPop>avgDan) && (avgPop>avgHip) ){
                max = avgPop;
                favorite = "Pop";
            }else if( (avgReg>avgPop) && (avgReg>avgHip) && (avgReg>avgDan) ){
                max = avgReg;
                favorite = "Regional";
            }else if( (avgHip>avgDan) && (avgHip>avgPop) && (avgReg>avgHip) ){
               max = avgHip;
                favorite = "HipHop";
            }else if( (avgDan>avgPop) && (avgDan>avgReg) && (avgDan>avgHip) ){
                max = avgDan;
                favorite = "Dance";
            }else{
                System.out.println("Error, Values unknown");
            }


            // Print the playlists 
            /* YOUR CODE GOES HERE ! */
            Scanner popScanner = new Scanner(likedSongs);
            System.out.println("");
            System.out.println(popPlaylist);
            while(popScanner.hasNext()){
                //String tempLine = popScanner.nextLine();
                String songName = popScanner.next();
                String artistName = popScanner.next();
                String genre = popScanner.next();
                int rating = popScanner.nextInt();

                switch(genre){
                    case"Pop":
                            System.out.println(songName+" "+artistName+" "+rating);
                        break;
                }
            }

            Scanner regScanner = new Scanner(likedSongs);
            System.out.println("");
            System.out.println(regionalPlaylist);
            while(regScanner.hasNext()){
                //String tempLine = popScanner.nextLine();
                String songName = regScanner.next();
                String artistName = regScanner.next();
                String genre = regScanner.next();
                int rating = regScanner.nextInt();

                switch(genre){
                    case"Regional":
                            System.out.println(songName+" "+artistName+" "+rating);
                        break;
                }
            }

            Scanner hipScanner = new Scanner(likedSongs);
            System.out.println("");
            System.out.println(hiphopPlaylist);
            while(hipScanner.hasNext()){
                //String tempLine = popScanner.nextLine();
                String songName = hipScanner.next();
                String artistName = hipScanner.next();
                String genre = hipScanner.next();
                int rating = hipScanner.nextInt();

                switch(genre){
                    case"HipHop":
                            System.out.println(songName+" "+artistName+" "+rating);
                        break;
                }
            }

            Scanner danScanner = new Scanner(likedSongs);
            System.out.println("");
            System.out.println(dancePlaylist);
            while(danScanner.hasNext()){
                //String tempLine = popScanner.nextLine();
                String songName = danScanner.next();
                String artistName = danScanner.next();
                String genre = danScanner.next();
                int rating = danScanner.nextInt();

                switch(genre){
                    case"Dance":
                            System.out.println(songName+" "+artistName+" "+rating);
                        break;
                }
            }

            // Print the favorite genre :D!
            /* YOUR CODE GOES HERE ! */
            System.out.println("");
            System.out.println("The Favorite Genre was:"+ favorite + " with a avg rating of :"+max);


        //} catch (/*YOUR CODE GOES HERE TOO!!!*/) {
            /* YOUR CODE GOES HERE ... */
        
       
    }
}
