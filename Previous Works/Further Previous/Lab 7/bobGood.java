import java.io.File;
 import java.io.FileNotFoundException;
import java.util.Scanner;

public class bobGood{
	public static void main(String[] args) throws FileNotFoundException {
		File operations = new File ("operations.txt");

			try{
        		
				Scanner reader = new Scanner(operations);
				reader.useDelimiter("\\n");

				while(reader.hasNext()){
					String firstNum = reader.next();
					String secondNum = reader.next();
					String operation = reader.next();

					/* this is just to check the reader
					String currLine = reader.nextLine();
					System.out.println(currLine);*/
				}

			}catch(FileNotFoundException e){
				System.out.println("no operations.txt");
			}
			System.out.println("test");
	}
}
