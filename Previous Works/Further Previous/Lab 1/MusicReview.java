import java.util.Scanner;

class MusicReview {
	public static void main(String[] args) {
		//----------
		// Example
		//----------
		String myName = "Christopher Robert Burk";  // Done
		System.out.println("Hi, my name is " + myName + ".");

		//----------
		// Q1
		//----------
		String songName = "Bird of Paradise";
		String songArtist = "Daniel Koestner";

		// TODO: intialize variables to fill in the two FIXMEs in the following print.

		System.out.println("I love listening to " + songName + " by " + songArtist + ".");

		//----------
		// Q2
		//----------

		// TODO: initialize variables to fill in the FIXMEs.
		// You may not declare/initialize any strings for this question.
		// Each variable type initialized in this question can only be used once. 

		// 
		Character ratingLetter = 'A'; // Character is a single letter so obviously
		Short releaseDate = 2018; 	// a postive number with no decimal thats small so short
		int playedAmount = 3191038; 		// a big number thats postive and whole
		Double vinylCost = 65.95; 		// I couldn't find a price, but double because decimals

		System.out.println("The song was released in year " + releaseDate + ".");
		System.out.println("On Spotify, the song has been played " + playedAmount + " times.");
		// Below FIXME should be a single variable including dollars and some cents.
		System.out.println("A vinyl copy might sell for $" + vinylCost + "!");
		// Below FIXME should be S, A, B, C, D, or F.
		System.out.println("Overall, this artist's songs should be considered " + ratingLetter + " tier.");

		//----------
		// Q3
		//----------
		// This is provided code for receiving input from the command line.
		System.out.println("\nThree questions to determine if I will go to the next concert...");
		Scanner scanner = new Scanner(System.in);
		// Program will print each prompt and await either true or false to be entered by the user.
		System.out.print("Is the next concert expensive? (type true or false): ");
		boolean isExpensive = scanner.nextBoolean();

		System.out.print("Will the concert be worth it? (type true or false): ");
		boolean worthIt = scanner.nextBoolean();

		System.out.print("Are my friends going to the concert? (type true or false): ");
		boolean areFriendsGoing = scanner.nextBoolean();
		// boolean variables isExpensive, worthIt, and areFriendsGoing
		// are now initialized with values entered by the user from the command line.

		// TODO: Replace initialization with boolean expression using above three boolean variables.
		boolean willAttendConcertResult = ((isExpensive && worthIt && areFriendsGoing) || !isExpensive || worthIt && areFriendsGoing );  // FIXME

		System.out.println("Will I go to the next concert? The answer is " + willAttendConcertResult + ".\n");
		
		//----------
		// Q4
		//----------

		// TODO: update the previous play count variable, incrementing it by 1, and fill in the FIXME.
		System.out.println("Oops, I just played the song again! Make that " + playedAmount + " times.");
	}
}