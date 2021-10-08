package BasicJava;

public class Swimmer extends Athlete {
	private int lungCapacity;

	public Swimmer(String firstNameInput, String lastNameInput, int lungCapacityInput) {
		super(firstNameInput, lastNameInput);
		this.lungCapacity=lungCapacityInput;
	}
	
	//Overriding Constructor
	public Swimmer(String firstNameInput, String lastNameInput) {
		super(firstNameInput, lastNameInput);
		this.lungCapacity=50;
	}
	
	public void swim() {
		System.out.println("Swimming in salt water tho");
		this.stamina -= 5;
		this.lungCapacity += 2;
	}
	
	public String displayStatus() {
		String result = String.format("This Swimmer's status are: \n Strength: %d, Speed: %d, Stamina: %d, First Name: %s, Last Name: %s, Lung Capacity: %d",
				this.strength, this.speed, this.stamina, this.firstName, this.lastName, this.lungCapacity);
		return result;
	}
	

}
