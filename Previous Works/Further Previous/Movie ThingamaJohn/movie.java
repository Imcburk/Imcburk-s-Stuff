public class movie{
	// Attributes
	private String title;
	private int length;
	private String director;
	private String genre;
	private String maturityRating;

	//constructor
	public movie(){ //default
	}
	public movie(String titleIn, int lengthIn, String directorIn, String genreIn, String maturityRatingIn){
		this.title = titleIn; //don't forget semicolons
		this.length = lengthIn;
		this.director = directorIn;
		this.genre = genreIn;
		this.maturityRating = maturityRatingIn;
	}
	//methods
	// the setters (O-O)
	public void setTitle(String titleIn){
		this.title = titleIn;
	}
	public void setLength(int lengthIn){
		this.length = lengthIn;
	}
	public void setDirector(String directorIn){
		this.director = directorIn;
	}
	public void setGenre(String genreIn){
		this.genre = genreIn;
	}
	public void setMaturityRating(String maturityRatingIn){
		this.maturityRating = maturityRatingIn;
	}
	//the getters ('_')
	public String getTitle(){
		return this.title;
	}
	public int getLength(){
		return this.length;
	}
	public String getDirector(){
		return this.director;
	}
	public String getGenre(){
		return this.genre;
	}
	public String getMaturityRating(){
		return this.maturityRating;
	}
	//the actuators (:>)
	public void getAllInfo(){
		System.out.println("Title: "+this.title);
		System.out.println("length in minutes: "+this.length);
		System.out.println("Directed by: "+this.director);
		System.out.println("genre: "+this.genre);
		System.out.println("Rated: "+this.maturityRating);
	}
}