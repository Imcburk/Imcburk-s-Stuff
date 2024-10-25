public class Song{

	// the 4 attributes of songs 𓆿
	private String title;
	private String artist;
	private int duration;
	private	int rating;

	// The Constructors 𓇚
	public Song(){
	}
	public Song(String titleIn, String artistIn){
		this.title = titleIn;
		this.artist = artistIn;
	}
	public Song(String titleIn, String artistIn, int durationIn, int ratingIn){
		this.title = titleIn;
		this.artist = artistIn;
		this.duration = durationIn;
		this.rating = ratingIn;
	}

	// The Settlers 𓀗
	public void setTitle(String titleIn){
		this.title = titleIn;
	}
	public void setArtist(String artistIn){
		this.artist = artistIn;
	}
	public void setDuration(int durationIn){
		this.duration = durationIn;
	}
	public void setRating(int ratingIn){
		this.rating = ratingIn;
	}

	// The Gettlers 𓁂
	public String getTitle(){
		return this.title;
	}
	public String getArtist(){
		return this.artist;
	}
	public int getDuration(){
		return this.duration;
	}
	public double getRating(){
		return this.rating;
	}

	// The Methodical 𓃕
	public void printInfo(){
		System.out.println("The Title of the current song is : "+this.title);
		System.out.println("The artist of that song is: "+this.artist);
		System.out.println("The length in seconds of the song is: "+this.duration);
		System.out.println("And the given rating is : "+this.rating);
	}
	public void printShortInfo(){
		System.out.println("The Title of the current song is : "+this.title);
		System.out.println("The artist of that song is: "+this.artist);
	}
}