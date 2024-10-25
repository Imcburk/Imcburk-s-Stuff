public class Movie{
	
	//Attributes

	private String movieName;
	private String genre;
	private int numTicketsAvailable;
	private int ticketPrice;
	private int popcornPrice;
	private int sodaPrice
	private int candyPrice;

	//Constructors

	public Movie(){
		// it's empty 𓁢 𒄘
	}
	public Movie(String movieNameIn){
		this.movieName = movieNameIn;
		// if you just know the name 𓁡 𒄦
	}
	public Movie(String movieNameIn, String genreIn, int numTicketsAvailableIn, int ticketPriceIn,
				int popcornPriceIn, int sodaPriceIn, int candyPriceIn){
		// for the distinguished gentleperson who has ALL the information 𓁳 𒅋
		this.movieName = movieNameIn;
		this.genre = genreIn;
		this.numTicketsAvailable = numTicketsAvailableIn;
		this.ticketPrice = ticketPriceIn;
		this.popcornPrice = popcornPriceIn;
		this.sodaPrice = sodaPriceIn;
		this.candyPrice = candyPriceIn;
	}

	//Getters/Setters
	
	//Methods
	
}
