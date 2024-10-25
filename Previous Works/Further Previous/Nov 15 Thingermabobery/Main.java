import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String[] args) throws FileNotFoundException{
	

		Song song1 = new Song("Fly me to the moon", "Frank Sinatra");
		Song song2 = new Song("Stress", "Justice");
		Song song3 = new Song("Bubble", "Shonan no Kaze");
		Song song4 = new Song("Derezzed", "Daft Punk");

	Song[] playList = {song1,song2,song3,song4};
	/* alternate array setup
	Song[] playList = new Song[4];
	playList[0] = song1;
	playList[1] = song2;
	playList[2] = song3;
	playList[3] = song4; */

	for(int i = 0; i < playList.length; i++){
		playList[i].printShortInfo();
		System.out.println("-_-_-=-_-_-=-_-_-=");
	}

 System.out.println("-------------------------------");

 Scanner input = new Scanner(System.in);
 for(int i = 0; i < playList.length; i++){
 	playList[i].printShortInfo();
 	System.out.println("Please type how long this song is in seconds:");
 	playList[i].setDuration(input.nextInt());
 	System.out.println("And now Rate this song from 1-10 using full integers");
 	playList[i].setRating(input.nextInt());
 	System.out.println("===========================");
 }

 System.out.println("With the information provided here's the new playlist info: ");
 System.out.println("----------------------");
	for(int i = 0; i < playList.length; i++){
		playList[i].printInfo();
		System.out.println("==========================="); //seperator
}

	Random shuffleMagic = new Random();
	int [] a = new int[4];

	// TO credit the youtube video that helped: 
	//“Store Random Number without Duplicated in Java(Oop).” YouTube, 9 Jan. 2019, youtu.be/V-20SSULv3o.
	for (int i =0; i<a.length; i++){
		a[i]= shuffleMagic.nextInt(4); //less than 10
		/* System.out.println("array with duplicates "+ a[i]); to see the numbers*/
		for(int j = 0; j < i; j++){
			if (a[i] == a[j]){
				i--;
				break;
			}
		}
	}
	System.out.println("Shuffle Time!");
	for(int i = 0; i< a.length; i++){
	 	playList[a[i]].printInfo();
	}

	File songs = new File ("songs.csv");
	try{

		Scanner songsReader = new Scanner(songs);
				songsReader.useDelimiter("\\|");
				songsReader.useDelimiter(",|\\n");
				while(songsReader.hasNext()){
					/* we're doing it manually since I forgot" IM SORRY */
					Song[] twentySongPlaylist = new Song[20];

					Song twentysong1 = new Song();
					Song twentysong2 = new Song();
					Song twentysong3 = new Song();
					Song twentysong4 = new Song();
					Song twentysong5 = new Song();
					Song twentysong6 = new Song();
					Song twentysong7 = new Song();
					Song twentysong8 = new Song();
					Song twentysong9 = new Song();
					Song twentysong10 = new Song();
					Song twentysong11 = new Song();
					Song twentysong12 = new Song();
					Song twentysong13 = new Song();
					Song twentysong14 = new Song();
					Song twentysong15 = new Song();
					Song twentysong16 = new Song();
					Song twentysong17 = new Song();
					Song twentysong18 = new Song();
					Song twentysong19 = new Song();
					Song twentysong20 = new Song();
					twentySongPlaylist[0] = twentysong1;
					twentySongPlaylist[1] = twentysong2;
					twentySongPlaylist[2] = twentysong3;
					twentySongPlaylist[3] = twentysong4;
					twentySongPlaylist[4] = twentysong5;
					twentySongPlaylist[5] = twentysong6;
					twentySongPlaylist[6] = twentysong7;
					twentySongPlaylist[7] = twentysong8;
					twentySongPlaylist[8] = twentysong9;
					twentySongPlaylist[9] = twentysong10;
					twentySongPlaylist[10] = twentysong11;
					twentySongPlaylist[11] = twentysong12;
					twentySongPlaylist[12] = twentysong13;
					twentySongPlaylist[13] = twentysong14;
					twentySongPlaylist[14] = twentysong15;
					twentySongPlaylist[15] = twentysong16;
					twentySongPlaylist[16] = twentysong17;
					twentySongPlaylist[17] = twentysong18;
					twentySongPlaylist[18] = twentysong19;
					twentySongPlaylist[19] = twentysong20;
					twentySongPlaylist[0].setTitle(songsReader.next());
					twentySongPlaylist[0].setArtist(songsReader.next());
					twentySongPlaylist[0].setDuration(songsReader.nextInt());
					twentySongPlaylist[0].setRating(songsReader.nextInt());
					twentySongPlaylist[1].setTitle(songsReader.next());
					twentySongPlaylist[1].setArtist(songsReader.next());
					twentySongPlaylist[1].setDuration(songsReader.nextInt());
					twentySongPlaylist[1].setRating(songsReader.nextInt());
					twentySongPlaylist[1].setTitle(songsReader.next());
					twentySongPlaylist[1].setArtist(songsReader.next());
					twentySongPlaylist[1].setDuration(songsReader.nextInt());
					twentySongPlaylist[1].setRating(songsReader.nextInt());
					twentySongPlaylist[2].setTitle(songsReader.next());
					twentySongPlaylist[2].setArtist(songsReader.next());
					twentySongPlaylist[2].setDuration(songsReader.nextInt());
					twentySongPlaylist[2].setRating(songsReader.nextInt());
					twentySongPlaylist[3].setTitle(songsReader.next());
					twentySongPlaylist[3].setArtist(songsReader.next());
					twentySongPlaylist[3].setDuration(songsReader.nextInt());
					twentySongPlaylist[3].setRating(songsReader.nextInt());
					twentySongPlaylist[4].setTitle(songsReader.next());
					twentySongPlaylist[4].setArtist(songsReader.next());
					twentySongPlaylist[4].setDuration(songsReader.nextInt());
					twentySongPlaylist[4].setRating(songsReader.nextInt());
					twentySongPlaylist[5].setTitle(songsReader.next());
					twentySongPlaylist[5].setArtist(songsReader.next());
					twentySongPlaylist[5].setDuration(songsReader.nextInt());
					twentySongPlaylist[5].setRating(songsReader.nextInt());
					twentySongPlaylist[6].setTitle(songsReader.next());
					twentySongPlaylist[6].setArtist(songsReader.next());
					twentySongPlaylist[6].setDuration(songsReader.nextInt());
					twentySongPlaylist[6].setRating(songsReader.nextInt());
					twentySongPlaylist[7].setTitle(songsReader.next());
					twentySongPlaylist[7].setArtist(songsReader.next());
					twentySongPlaylist[7].setDuration(songsReader.nextInt());
					twentySongPlaylist[7].setRating(songsReader.nextInt());
					twentySongPlaylist[8].setTitle(songsReader.next());
					twentySongPlaylist[8].setArtist(songsReader.next());
					twentySongPlaylist[8].setDuration(songsReader.nextInt());
					twentySongPlaylist[8].setRating(songsReader.nextInt());
					twentySongPlaylist[9].setTitle(songsReader.next());
					twentySongPlaylist[9].setArtist(songsReader.next());
					twentySongPlaylist[9].setDuration(songsReader.nextInt());
					twentySongPlaylist[9].setRating(songsReader.nextInt());
					twentySongPlaylist[10].setTitle(songsReader.next());
					twentySongPlaylist[10].setArtist(songsReader.next());
					twentySongPlaylist[10].setDuration(songsReader.nextInt());
					twentySongPlaylist[10].setRating(songsReader.nextInt());
					twentySongPlaylist[12].setTitle(songsReader.next());
					twentySongPlaylist[12].setArtist(songsReader.next());
					twentySongPlaylist[12].setDuration(songsReader.nextInt());
					twentySongPlaylist[12].setRating(songsReader.nextInt());
					twentySongPlaylist[13].setTitle(songsReader.next());
					twentySongPlaylist[13].setArtist(songsReader.next());
					twentySongPlaylist[13].setDuration(songsReader.nextInt());
					twentySongPlaylist[13].setRating(songsReader.nextInt());
					twentySongPlaylist[14].setTitle(songsReader.next());
					twentySongPlaylist[14].setArtist(songsReader.next());
					twentySongPlaylist[14].setDuration(songsReader.nextInt());
					twentySongPlaylist[14].setRating(songsReader.nextInt());
					twentySongPlaylist[15].setTitle(songsReader.next());
					twentySongPlaylist[15].setArtist(songsReader.next());
					twentySongPlaylist[15].setDuration(songsReader.nextInt());
					twentySongPlaylist[15].setRating(songsReader.nextInt());
					twentySongPlaylist[16].setTitle(songsReader.next());
					twentySongPlaylist[16].setArtist(songsReader.next());
					twentySongPlaylist[16].setDuration(songsReader.nextInt());
					twentySongPlaylist[16].setRating(songsReader.nextInt());
					twentySongPlaylist[17].setTitle(songsReader.next());
					twentySongPlaylist[17].setArtist(songsReader.next());
					twentySongPlaylist[17].setDuration(songsReader.nextInt());
					twentySongPlaylist[17].setRating(songsReader.nextInt());
					twentySongPlaylist[18].setTitle(songsReader.next());
					twentySongPlaylist[18].setArtist(songsReader.next());
					twentySongPlaylist[18].setDuration(songsReader.nextInt());
					twentySongPlaylist[18].setRating(songsReader.nextInt());
					twentySongPlaylist[19].setTitle(songsReader.next());
					twentySongPlaylist[19].setArtist(songsReader.next());
					twentySongPlaylist[19].setDuration(songsReader.nextInt());
					twentySongPlaylist[19].setRating(songsReader.nextInt());

					System.out.println("This is the normal 20 length playlist");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					for(int r = 0; r< twentySongPlaylist.length; r++){
						twentySongPlaylist[r].printInfo();
					

					Random imSorry = new Random(); //shufflemagic
						int [] itsTooLong = new int[20];	//a
						for (int i =0; i<itsTooLong.length; i++){
							itsTooLong[i]= imSorry.nextInt(20); //less than 10
							/* System.out.println("array with duplicates "+ a[i]); to see the numbers*/
							for(int j = 0; j < i; j++){
								if (itsTooLong[i] == itsTooLong[j]){
									i--;
									break;
								}
							}
						}
						System.out.println("Shuffle Time!");
						for(int i = 0; i< itsTooLong.length; i++){
						 	playList[itsTooLong[i]].printInfo();
						}


					}




			


					songsReader.close();
				}
			}catch(FileNotFoundException e){ // rehash from comp lab 1 
				System.out.println("songs.csv has not been found");
			}



	//idk bro
}
}