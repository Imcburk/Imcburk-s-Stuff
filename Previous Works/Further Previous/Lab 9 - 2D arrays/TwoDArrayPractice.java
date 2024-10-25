public class TwoDArrayPractice {

    public static void main(String[] args) {
        int[][] array = {
            {15, 83, 52, 36, 44},
            {99, 32, 78, 64, 9},
            {45, 58, 12, 67, 38},
            {3, 96, 89, 71, 27},
            {24, 7, 91, 0, 5}
        };
        
        System.out.println("\nRow Sums:");
        print1DArray(rowSum(array));
        System.out.println("-------------------------"); //this is just to seperate the prints 𓆲
        System.out.println("\nColumn Sums:");
        print1DArray(columnSum(array));
        System.out.println("-------------------------");
        System.out.println("\nDiagonal Sums:");
        print1DArray(diagonalSums(array));
        System.out.println("-------------------------");
        System.out.println("\n2D Array Traversed Backwards:");
        print2DArray(traverseBackwards(array));
    }

    // ok thingathingamabobery
    // Each element should be separated by a tab.
    public static void print1DArray(int[] array) {
        for(int i = 0; i < array.length ; i++){
            System.out.println(array[i]+ "\t" );
        } // yos

    }

    // This method should print the provided 2D array in a tabular form.
    // Each row of the matrix should be printed on a new line,
    // and each element of the row should be separated by a tab.
    public static void print2DArray(int[][] array) {
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]+"\t");
            }
        }
    }
    
    // This method should calculate and return the sum of numbers in each row of the 2D array.
    // The result should be a 1D array where each element is the sum of the numbers in the corresponding row of the 2D array.
    public static int[] rowSum(int[][] array) {
        // Temporary return statement. You can delete or replace it when implementing this method.
        return new int[array.length]; // Returns an array filled with zeros.
    }

    // This method should calculate and return the sum of numbers in each column of the 2D array.
    // The result should be a 1D array where each element is the sum of the numbers in the corresponding column of the 2D array.
    public static int[] columnSum(int[][] array) {
        // Temporary return statement. You can delete or replace it when implementing this method.
        return new int[array[0].length]; // Returns an array filled with zeros.
    }

    // This method should calculate and return the sum of numbers in the two main diagonals of the 2D array.
    // The result should be a 1D array where the first element is the sum of the main diagonal and the second element is the sum of the secondary diagonal.
    public static int[] diagonalSums(int[][] array) {
        // Temporary return statement. You can delete or replace it when implementing this method!
        return new int[2]; // Returns an array with two zeros.
    }

    // This method should return a new 2D array that is a reversed version of the original 2D array.
    // The new 2D array should have rows in reverse order, and the elements within each row should also be in reverse order.
    public static int[][] traverseBackwards(int[][] array) {
        // Temporary return statement. You can delete or replace it when implementing this method.
        return new int[array.length][array[0].length]; // Returns a 2D array filled with zeros.
    }



}


