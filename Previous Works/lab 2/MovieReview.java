import java.util.Scanner;

class MovieReview {
	public static void main(String[] args) {
		//----------
		// Example
		//----------
		String myName = "Christopher Robert Burk";  // TODO: Change to your own name.
		System.out.println("Hi, my name is " + myName + " .");

		//----------
		// Q1
		//----------

		// TODO: intialize variables to fill in the two FIXMEs in the following print.

		String favMovie = "John Wick 2";
		String favMovieDirector = "Chad Stalheski";

		System.out.println("My favorite movie is " + favMovie + " directed by " + favMovieDirector + ".");

		//----------
		// Q2
		//----------

		// TODO: initialize variables to fill in the FIXMEs.
		// You may not declare/initialize any strings for this question.
		// int, char, double, long
		// Each variable type initialized in this question can only be used once.

		int releaseDate = 2017;
		char movieRating = 'A';
		double ticketPrice = 8.97;
		long ticketSales = 16000000;

		System.out.println("The movie was released in year " + releaseDate + ".");
		// Below you will print number of tickets sold, Ex. 103150000 tickets
		System.out.println("While in the box office this movie sold around " + ticketSales + " tickets.");
		// Below FIXME should be a single variable including dollars and some cents.
		System.out.println("A movie ticket to see it might sell for $" + ticketPrice + "!");
		// Below FIXME should be S, A, B, C, D, or F.
		System.out.println("Overall, this movie should be considered " + movieRating + " tier.");

		//----------
		// Q3
		//----------

		// TODO: update the previous ticket count variable, incrementing it by 1, and fill in the FIXME.

		ticketSales=ticketSales+1;

		System.out.println("I bought another ticket! Make that " + ticketSales + " tickets.");
	}
}