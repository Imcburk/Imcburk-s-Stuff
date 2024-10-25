public class Car{
// The Attributes 𓀰
 private String make;
 private String model;
 private int year;
 private String color;
 private Boolean isElectric; 
 /*boolean is primitive compared to Boolean which can store TRUE,FALSE, and null 𓃼 */
 private int cost; 

// The Constructors 𓀄
public Car(){ /* the default no parameter constructor 𓂀 */
}
public Car(String makeIn, String modelIn, int yearIn){
	this.make = makeIn;
	this.model = modelIn;
	this.year = yearIn;
}

// The Setters, Getters, and Actuators 𓀌 𓀩 𓁏

// Setters 𓀌
public void setMake(String makeIn){
	this.make = makeIn;
}
public void setModel(String modelIn){
	this.model = modelIn;
}
public void setYear(int yearIn){
	this.year = yearIn;
}
public void setColor(String colorIn){
	this.color = colorIn;
}
public void setIsElectric(Boolean isElectricIn){
	this.isElectric = isElectricIn;
}
public void setCost(int costIn){
	this.cost = costIn;
}

// Getters 𓀩

public String getMake(){
	return this.make;
}
public String getModel(){
	return this.model;
}
public int getYear(){
	return this.year;
}
public String getColor(){
	return this.color;
}
public Boolean getIsElectric(){
	return this.isElectric;
}
public int getCost(){
	return this.cost;
}

// Actuator(s) 𓁏
public void displayInfo(){
	System.out.println("");
	System.out.println("The vehicle's info is as follows:");
	System.out.println("The make: "+this.make);
	System.out.println("The model: "+this.model);
	System.out.println("Its color: "+this.color);
	System.out.println("Is it an electric vehicle? "+this.isElectric);
	System.out.println("And the price: $"+this.cost+" USD");
}
public void getHotPinkPaintJob(){
	this.color = "Hot Pink";
}
public void carIsCheaper(){
	this.cost = this.cost-1000;
}
public void increaseCarPrice(){
	this.cost = this.cost+1000;
} 
// realistically you can't change the year,model,make, and EV conversion is complicated 𓇻.
public void convertIntoEV(){
	if(this.isElectric == false){
		this.isElectric = true;
		this.cost = this.cost+20000; /*based off an estimate from the prices i've seen 𓆟 */	
		}
	System.out.println("It's electric! boogie-woogie!");
	}
}