import java.util.Scanner;

/* The uses of scanner.next
scanner.nextDouble();
scanner.nextLine();
scanner.nextInt();
scanner.nextBoolean();
scanner.nextLong();
*/

class MovieReviewTwo {
	public static void main(String[] args) {

		// Example
		//  System.out.println("Enter your username: ");
    	// 	String username = scanner.nextLine();
    	// 	System.out.println("Username is " + username);

		//----------
		// Q1
		//----------
		// TODO: Adding onto last lab, we will initialize variables to fill in the FIXME's
		// This time you will be using user input from the scanner to do so!
		// Start by adding in the prompts for your user, as seen in the example above


		// TODO: intialize variables using user input to fill in the two FIXMEs in the following print
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your favorite movie name.");
		String movieName = scanner.nextLine();
		System.out.println("And now input the Direcor of that movie.");
		String movieDirector = scanner.nextLine();
		System.out.println(""); 
		System.out.println("Given from the information provided here's what we have:");
		System.out.println(""); 

		System.out.println("Your favorite movie is " + movieName + " directed by " + movieDirector + ".");
		System.out.println(""); 

		//----------
		// Q2
		//----------

		System.out.println("Please type out the year the movie was released in numbers.");
		int movieYear = scanner.nextInt();
		System.out.println("Now type out how many tickets sold in numbers.");
		long movieTicketsSold = scanner.nextLong();
		System.out.println("Type a letter (EX: A) for your rating of the movie.");
		char movieRating =  scanner.next().charAt(0);
		System.out.println(""); 
		System.out.println("Based off the Provided info here's what we gathered...");
		System.out.println(""); 


		//Below you will print the year the movie was released
		System.out.println("The movie was released in year " + movieYear + ".");

		// Below you will print number of tickets sold, Ex. 103150000 tickets
		System.out.println("While in the box office this movie sold " + movieTicketsSold + " ticket.");
	
		// Below FIXME should be S, A, B, C, D, or F.
		System.out.println("Overall, this movie should be considered " + movieRating + " tier.");
		System.out.println(""); 

		//----------
		// Q3
		//----------

		// TODO: checking if the price is over $20.00
		// Below should be a single variable including dollars and some cents.
		
		System.out.println("Enter the price of the movie in the provided format (EX: 5.99):");
		double moviePrice = scanner.nextDouble();
		boolean isMovieExpensive = false; /* I think the Default variable is false but yeah 𓅄 */
		if(moviePrice>20.00){
			isMovieExpensive = true;
		}else{
			isMovieExpensive = false;
		}

		// Initialize a boolean variable to check if the price is above $20.00
		// Using the boolean, answer the question below (expensive is above $20.00)

		System.out.println("Is the movie expensive? " + isMovieExpensive +".");

	}
}