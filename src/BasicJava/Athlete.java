package BasicJava;

public class Athlete {
	protected int strength;
	protected int stamina;
	protected int speed;
	protected String firstName;
	protected String lastName;
	
	public Athlete(String firstNameInput, String lastNameInput) {
		this.firstName=firstNameInput;
		this.lastName=lastNameInput;
		this.stamina=10;
		this.speed=10;
		this.strength=10;
		
	}
	public String displayStatus() {
		String result = String.format("This Athlete's status are: \n Strength: %d, Speed: %d, Stamina: %d, First Name: %s, Last Name: %s",
				this.strength, this.speed, this.stamina, this.firstName, this.lastName);
		return result;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
