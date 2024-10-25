import java.util.Scanner;

class MovieSnackRecommendation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//----------
		// Q1
		//----------
		// TODO: use the appropriate scanner for each data type
		// Based on the following user prompts, replace the "FIX ME" with the appropriate scanner to store user input.

		System.out.println("How much money (EX: 10.00) are you willing to spend on movie snacks?: ");
		double pricePoint = scanner.nextDouble();
		System.out.println("");
		System.out.println("I would be interested in trying a slushy! (type true or false): ");
		boolean isInterested = scanner.nextBoolean();
		System.out.println("");
		System.out.println("I would prefer popcorn over candy (type true or false): ");
		boolean preferPopcorn = scanner.nextBoolean();
		System.out.println("");
		System.out.println("How many people are you buying snacks for?: ");
		int numPeople = scanner.nextInt();
		System.out.println("");

		
		//----------
		// Q2
		//----------
		// TODO: implement logic using conditionals (nested if-else statements) based on the following logic tree:
		// NOTE: Your program should use the variables defined above and output exactly ONE RECOMMENDATION
		//
		// 								<pricePoint>
		// 								/           \
		//                      <10.00 /             \ >=10.00
		//                            /               \
		//               <isInterested>              <preferPopcorn>
		//                  /      \                     /         \
		//            true /        \ false        true /           \ false
		//                /          \                 /             \
		//          STRAWBERRY      SODA       LARGE POPCORN          <numPeople>
		//           SLUSHY                                              /    \
		//                                                            1 /      \ >1
		//                                                             /        \
		//                                                          COOKIE    NERDS 
		//                                                          DOUGH     GUMMY
		//                                                          BITES     CLUSTERS



		System.out.print("Recommendation: "); // Don't change this
		String recommandation = "Unknown"; // we dunno 𓅦
		//System.out.println("Based off your choices..." + recommandation +" would suit your needs."); too Early 𓃼
		/* ADD YOUR CODE HERE */
		
		if(pricePoint>=10.00){
					if(preferPopcorn == false){
						if(numPeople>1){
							recommandation = "NERDS GUMMY CLUSTERS";
						}else{
							recommandation = "COOKIE DOUGH BITES";
						}
					}else{
						recommandation = "LARGE POPCORN";
					}
				}else{
					if(isInterested){
						recommandation = "STRAWBERRY SLUSHY";
					}else{
						recommandation = "SODA";
					}
				}

		System.out.println("Based off your choices..." + recommandation +" would suit your needs.");
		System.out.println("");

		//----------
		// Q3
		//----------
		// TODO: rate your recommendation
		// Below should be a single variable
	
		System.out.println("On a scale from 1-10, how satisfied are you with your recommendation? (enter a positive integer) ");
		System.out.println("");
		// Initialize a variable to to accept an integer rating from 1-10
		/* ADD YOUR CODE HERE */

		int rating = scanner.nextInt();

		// Using the rating, write a conditional statement based on the following scale:
		// If the rating is less than or equal to 6 the user gets a free movie ticket
		// Otherwise the user gets a discount on their next movie ticket
		// NOTE: If the rating is on a scale from 1-10 inclusive, anything outside of that range is considered invalid.

		if (rating >10 || rating <1) { // FIXED 𓅮
			System.out.println("Invalid input. Goodbye!");
		}else{
		if ((6>= rating) && (rating>=1)) { // FIXED it so it didn't past trigger the invalid input thing𓅮
			System.out.println("Thank you for your feedback! Here is the code for a free movie ticket: JFH34J5J ");
		}
		else { 
			System.out.println("Thank you for your feedback! Here is the code for a 50% discount on your next movie ticket: KFH34J5J ");
		}	
		}	
	}
}