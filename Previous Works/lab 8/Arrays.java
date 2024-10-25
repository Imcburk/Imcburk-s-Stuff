public class Arrays{
	public static void main(String[] args){
		// Declare an array with numbers 10, 27, 91, 42, 12, 72, 39

		int[] numbers = {10,27,91,42,12,72,39}; 
		printContents(numbers);
		printEvenIndexContents(numbers);
		printOddContents(numbers);
		System.out.println("");
		System.out.println("And the Range is: "+rangeNumber(numbers));
		System.out.println("");
		System.out.println("And the second largest number in the array is: "+secondLargestNum(numbers));
	}

	// Create a method that traverses the array and prints out the contents.
	public static void printContents(int [] numbers ){
		System.out.println(" "); // spacing is king 𓁖
		System.out.println("The array is as listed:");
		for (int i = 0; i < numbers.length ; i++){
				System.out.print(numbers[i]+" ");
		}
		System.out.println(" ");
	}
	// Create a method that returns the sum of the even indexes. (Not even numbers!)
	public static void printEvenIndexContents(int [] numbers ){
		System.out.println(" "); // another one -DJ Jhaled 𓁕
		System.out.println("The even indexes of the array is as listed:");
		for (int i = 0; i < numbers.length ; i++){
			if( (i % 2) == 0){
				System.out.print(numbers[i]+" ");
			}
		}
		System.out.println("");
	}


	// Create a method that returns the sum of all the odd numbers in the array. (Not odd indexes!)
	public static void printOddContents(int [] numbers ){
			System.out.println(" "); 
			System.out.println("The odd numbers of the array is as listed:");
			for (int i = 0; i < numbers.length ; i++){
				if( (numbers[i] % 2) == 1){
					System.out.print(numbers[i]+" ");
			}
		}
		System.out.println("");
	}


	// Create a method that returns the range of the array. (Range = max - min)
	public static int rangeNumber(int[] numbers){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int range = 0;
		for(int i = 0; i < numbers.length ; i++){
			if(numbers[i]<min){
				min = numbers[i];
			}
			if(numbers[i]>max){
				max = numbers[i];
			}
		}
		range = max - min;
		return range;
	}


	// Create a method that returns the second largest number in the array
	public static int secondLargestNum(int [] numbers){
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length ; i++){
			if(numbers[i]>max){
				max = numbers[i];
			}
		}
		for(int i = 0; i < numbers.length ; i++){
			if( (numbers[i]>secondMax) && (numbers[i]<max) ){
				secondMax = numbers[i];
			}
		}
	return secondMax;
	}
	//End of program below 𒃎 𒃱 𒃴
}