import java.util.Scanner;

public class Main{
  public static void main(String[] args){

  	System.out.println("For out first vehicle:");
	Car oldReliable = new Car();
	oldReliable.setMake("Ford");
	oldReliable.setModel("Explorer Sport");
	oldReliable.setYear(2003);
	oldReliable.setColor("Red Matte");
	oldReliable.setIsElectric(false);
	oldReliable.setCost(21870);
	oldReliable.displayInfo();
	System.out.println("");
	System.out.println("let's get a paintjob!");
	System.out.println("");
	oldReliable.getHotPinkPaintJob();
	System.out.println("the new color is: "+oldReliable.getColor()+"!");
	System.out.println("");
	System.out.println("Let's convert the vehicle into an EV! (it cost 20000)");
	oldReliable.convertIntoEV();
	oldReliable.displayInfo();
	System.out.println("");

	System.out.println("And the next vehicle is:");
	Car initialDCar= new Car("Toyota","Sprinter Trueno", 1986);
	initialDCar.setColor("Black and White");
	initialDCar.setIsElectric(false);
	initialDCar.setCost(23928);
	initialDCar.displayInfo();
	System.out.println("");

	//time for the input-a-nator 𓈦

	Scanner carInput = new Scanner(System.in);
	System.out.println("Please input your desired vehicle make: ");
	Car customCar = new Car(); 
	customCar.setMake(carInput.next());
	System.out.println("What is the Model?");
	customCar.setModel(carInput.next());
	System.out.println("When was the vehicle made?");
	customCar.setYear(carInput.nextInt());
	System.out.println("What color is the vehicle?");
	customCar.setColor(carInput.next());
	System.out.println("Enter true or false if the vehicle is electric:");
	customCar.setIsElectric(carInput.nextBoolean());
	System.out.println("How much would it cost in USD?");
	customCar.setCost(carInput.nextInt());
	System.out.println("");

	System.out.println("Based off your input,");
	customCar.displayInfo();
	}
}