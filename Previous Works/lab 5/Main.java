import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
	
class Main{
		public static void main(String[] args) throws FileNotFoundException{

		// The initialization of variables 𓅭
		double avgTemp = 0;
		double highestTemp = Double.MIN_VALUE;
		double lowestTemp = Double.MAX_VALUE;
		int twentyFivePlusDays = 0;
		int numDays = 0;

		// The important stuff 𓀠
		File myFile = new File("temperatures.csv");
		Scanner scanner = new Scanner(myFile);

		// The big ol' loop 𓃒
		while(scanner.hasNextInt()){ // Using .hasNextInt because of the spare line on the CSV 𓅡
			numDays++;
			int numberToCheck = scanner.nextInt();
			//System.out.println(numberToCheck); Used this to find out that there's an extra line 𓅹
			avgTemp = avgTemp + numberToCheck;
			if(numberToCheck>25.0){
				twentyFivePlusDays++;
			}
			if(highestTemp<numberToCheck){
				highestTemp = numberToCheck;
			}
			if(lowestTemp>numberToCheck){
				lowestTemp = numberToCheck; 
			}
		}
		//I just like to space out my stuff, yeah? 𓅇
		System.out.println("Here's what's been gathered from the data");
		System.out.println("");
		System.out.println("The Average Temperature was: " +(avgTemp/numDays)+" Degrees Celsius");
		System.out.println("");
		System.out.println("The highest recorded temperature was: " + highestTemp+" Degrees Celsius");
		System.out.println("");
		System.out.println("The lowest recorded temperature was: "+lowestTemp+" Degrees Celsius");
		System.out.println("");
		System.out.println("And the amount of days over 25 Degrees Celsius was: "+twentyFivePlusDays);
		System.out.println("");
		System.out.println("That's all folks! Have a good one!");

	}
}