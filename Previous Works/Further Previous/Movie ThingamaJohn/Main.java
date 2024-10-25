public class Main{
	public static void main(String[] args){

		movie johnWick3 = new movie("John Wick 3", 131, "Chad Stahelski", "Action", "R" );
		System.out.println("the two movies I chose were:");
		System.out.println("");
		johnWick3.getAllInfo();

		System.out.println("");
		System.out.println("and ");
		System.out.println("");

		movie drive = new movie();
		drive.setTitle("Drive");
		System.out.println("the movie: "+drive.getTitle());
		drive.setLength(100);
		drive.setDirector("Nicolas Winding Refn");
		System.out.println("by " + drive.getDirector());
		drive.setMaturityRating("R");
		System.out.println("Which is " + drive.getLength() + " minutes of " + drive.getMaturityRating() + " rated action!");
	}
}