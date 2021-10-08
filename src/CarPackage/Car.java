package CarPackage;

import java.util.Random;

public class Car {
	// Class Structure: 
	//1. Creating Instances/Properties/Fields/Variables 
	//2. Creating Constructor based on those fields/instances (make sure it has the same name as the class does) 
	//3. Setters and Getters (to pull/use Class's fields if they were Declared as 'private' (no straight accessibility to the Class's fields)
	//4. Methods to Operate w/Fields
	
	
	//Java DataType Approach to variables, methods, classes and so on:
	// accessibility, data type return, name
	
	
	//1 creating instances 
	private int mileage;
	private String licencePlateNum;
	private double gallonsLeft;
	private int milesPerGalon;
	private String model;
	
	//Static  instances assigned w/ 0, make sure they are public, which means no Setters and Getters to them 
	public static int totalCarsCreated=0;
	public static int totalMileageForAllCars=0;
	
	//2 Constructor - same Class Name 
	public Car(int mileageInput,int milesPerGalonInput, String modelInput) {
		this.mileage = mileageInput;
		this.licencePlateNum = this.generateLicencePlateNumber();
		this.gallonsLeft = 35.0;
		this.milesPerGalon = milesPerGalonInput;
		this.model = modelInput;
		
		totalCarsCreated ++;
		totalMileageForAllCars+=this.mileage;
	}

	public void drive(int numMilesDriven) {
		
		if(this.milesPerGalon * this.gallonsLeft > numMilesDriven) {
			this.mileage+=numMilesDriven;
			double numGallonsUsedUp=numMilesDriven/this.milesPerGalon;
			System.out.println(numGallonsUsedUp);
			
			double gallonsLeft = this.gallonsLeft - numGallonsUsedUp;
			this.setGallonLeft(gallonsLeft);
			totalMileageForAllCars += numMilesDriven;
			
		}else {
			System.out.println("Better call that gieco roadside assistance now");
		}
		
		
	}
	
	public String generateLicencePlateNumber() {
		//figure out how to generate a random number between 0-9
		//then do that process 6 times
		//each time, add that number to an empty stirng
		//results in a string with 6 random numbers
		Random rand = new Random();
		String result="";
		for(int i=0;i<6;i++) {
			int rand_int = rand.nextInt(10);
			result+=rand_int;
			
		}
		System.out.println("Random Integers: " + result);
		
		return result;
		
	}
	
	
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getLicencePlateNum() {
		return licencePlateNum;
	}

	public void setLicencePlateNum(String licencePlateNum) {
		this.licencePlateNum = licencePlateNum;
	}

	public double getGallonLeft() {
		return gallonsLeft;
	}

	public void setGallonLeft(double gallonsLeft) {
		this.gallonsLeft = gallonsLeft;
	}

	public int getMilesPerGalon() {
		return milesPerGalon;
	}

	public void setMilesPerGalon(int milesPerGalon) {
		this.milesPerGalon = milesPerGalon;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	
}
