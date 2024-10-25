import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlaylistExtra {
    public static void main(String[] args) throws FileNotFoundException {
        String popPlaylist = "------Pop Playlist!------";
        String regionalPlaylist = "-----Regional Playlist-----";
        String hiphopPlaylist = "------HipHop Playlist-----";
        String dancePlaylist = "-----Dance Playlist------";
        File likedSongs = new File ("likedsongs.txt");
    } //end of main
    public static String addToPlaylist(String playlist)throws FileNotFoundException {
       String throwBack = "";
        if(playlist.equals("------Pop Playlist!------")){
            Scanner popScanner = new Scanner(new File ("likedsongs.txt"));
            System.out.println("");
            System.out.println("------Pop Playlist!------");
            while(popScanner.hasNext()){
                String songNamePop = popScanner.next();
                String artistNamePop = popScanner.next();
                String genrePop = popScanner.next();
                int ratingPop = popScanner.nextInt();
                switch(genrePop){
                    case"Pop":
                            throwBack = (throwBack + "\n" + songNamePop+" "+artistNamePop+" "+ratingPop);
                }
            }return throwBack;
        }else if(playlist.equals("-----Regional Playlist-----")){
            Scanner regScanner = new Scanner(new File ("likedsongs.txt"));
            System.out.println("");
            System.out.println("-----Regional Playlist-----");
            while(regScanner.hasNext()){
                String songNameReg = regScanner.next();
                String artistNameReg = regScanner.next();
                String genreReg = regScanner.next();
                int ratingReg = regScanner.nextInt();
                switch(genreReg){
                    case"Regional":
                            throwBack = (throwBack + "\n" + songNameReg+" "+artistNameReg+" "+ratingReg);
                }
            } return throwBack;
        }else if(playlist.equals("------HipHop Playlist-----")){
            Scanner hipScanner = new Scanner(new File ("likedsongs.txt"));
            System.out.println("");
            System.out.println("------HipHop Playlist-----");
            while(hipScanner.hasNext()){
                String songNameHip = hipScanner.next();
                String artistNameHip = hipScanner.next();
                String genreHip = hipScanner.next();
                int ratingHip = hipScanner.nextInt();
                switch(genreHip){
                    case"HipHop":
                            throwBack = (throwBack + "\n" + songNameHip+" "+artistNameHip+" "+ratingHip);
                }
            } return throwBack;
        }else if(playlist.equals("-----Dance Playlist------")){
            Scanner danScanner = new Scanner(new File ("likedsongs.txt"));
            System.out.println("");
            System.out.println("-----Dance Playlist------");
            while(danScanner.hasNext()){
                //String tempLine = popScanner.nextLine();
                String songNameDan = danScanner.next();
                String artistNameDan = danScanner.next();
                String genreDan = danScanner.next();
                int ratingDan = danScanner.nextInt();
                switch(genreDan){
                    case"Dance":
                            throwBack = (throwBack + "\n" + songNameDan+" "+artistNameDan+" "+ratingDan);          }
        }return throwBack;          
     }
     return ("Error");
    }
    public static int calculateAverageRating(String playlist)throws FileNotFoundException {
       int averageRating = 0;
       int count4Avg = 0;
        if(playlist.equals("------Pop Playlist!------")){
            Scanner popScanner = new Scanner(new File ("likedsongs.txt"));
            while(popScanner.hasNext()){
                String songNamePop = popScanner.next();
                String artistNamePop = popScanner.next();
                String genrePop = popScanner.next();
                int ratingPop = popScanner.nextInt();
                switch(genrePop){
                    case"Pop":
                            averageRating = (averageRating+ratingPop);
                            count4Avg++;
                }
            }return (averageRating/count4Avg);
        }else if(playlist.equals("-----Regional Playlist-----")){
            Scanner regScanner = new Scanner(new File ("likedsongs.txt"));
            while(regScanner.hasNext()){
                String songNameReg = regScanner.next();
                String artistNameReg = regScanner.next();
                String genreReg = regScanner.next();
                int ratingReg = regScanner.nextInt();
                switch(genreReg){
                    case"Regional":
                            averageRating = (averageRating+ratingReg);
                            count4Avg++;
                }
            } return (averageRating/count4Avg);
        }else if(playlist.equals("------HipHop Playlist-----")){
            Scanner hipScanner = new Scanner(new File ("likedsongs.txt"));
            while(hipScanner.hasNext()){
                String songNameHip = hipScanner.next();
                String artistNameHip = hipScanner.next();
                String genreHip = hipScanner.next();
                int ratingHip = hipScanner.nextInt();
                switch(genreHip){
                    case"HipHop":
                            averageRating = (averageRating+ratingHip);
                            count4Avg++;
                }
            } return (averageRating/count4Avg);
        }else if(playlist.equals("-----Dance Playlist------")){
            Scanner danScanner = new Scanner(new File ("likedsongs.txt"));
            while(danScanner.hasNext()){
                String songNameDan = danScanner.next();
                String artistNameDan = danScanner.next();
                String genreDan = danScanner.next();
                int ratingDan = danScanner.nextInt();
                switch(genreDan){
                    case"Dance":
                            averageRating = (averageRating+ratingDan);
                            count4Avg++;
                }
        }return (averageRating/count4Avg);
     }
     return (0);
    }
    public static String determineFavoriteGenre(int popAvg, int hiphopAvg, int danceAvg, int regionalAvg) {
        String favoriteGenre = "Unknown";
        if( (popAvg>=hiphopAvg)&&(popAvg>=danceAvg)&&(popAvg>=regionalAvg) ){
            favoriteGenre = "Pop";
            return favoriteGenre;
        }else if( (hiphopAvg>=popAvg)&&(hiphopAvg>=danceAvg)&&(hiphopAvg>=regionalAvg) ){
            favoriteGenre = "Hiphop";
            return favoriteGenre;
        }else if( (danceAvg>=popAvg)&&(danceAvg>=hiphopAvg)&&(danceAvg>=regionalAvg) ){
            favoriteGenre = "Dance";
            return favoriteGenre;
        }else if( (regionalAvg>=popAvg)&&(regionalAvg>=hiphopAvg)&&(regionalAvg>=danceAvg) ) {
            favoriteGenre = "Regional";
            return favoriteGenre;
        }else
            return favoriteGenre;
    }
}
