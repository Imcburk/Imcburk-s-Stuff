public class ArrayPractice{

    public static void main(String[] args) {

        // Initialize int, char, and double arays with values seen on the examples in the instructions doc.
           char charArray [] = 
           {'b','o','b','x','g','o','o','d'};

        // Print results of Method #1 (Print char array)
            
        // Print results of Method #2 (Reverse char array and print it)
           reverseCharArray(charArray);
           System.out.println(reverseCharArray);
        // Print results of Method #3 (Add all numbers from double array and print sum)
            
        // Print results of Method #4 using find = "min". (Find minimum of integer array)
            
        // Print results of Method #4 using find = "max". (Find maximim of integer array)
       
    }


    // Method #1 (Replace all x's with '_' and print all elements)



    public static void printCharArray(char[] array) {
        
          
    }


    // Method #2 (Reverse char array and return new reversed char array)
    public static char[] reverseCharArray(char[] array) {
        char[] charArray = new char[array.length]; //creates a new array same size
     for(int i = array.length; i >= 0 ; i--){
        for(int j = 0; j <array.length; j++){
            array[j] = array[i];
            return charArray;
        }
     }
        
    }


    // Method #3 (Add all elements of doubleArray and return sum)
    public static double sumDoubleArray(double[] array) {
        
    }

    
    // Method #4 (Find the min/max of given array)
    public static int findMinMax(int[] array, String find) {
        
    }

}
