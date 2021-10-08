package ObjectMaster;

public class Human {

	private int intelligence;
	private int stealth;
	private int strength;
	private int health;
	private String name;
	///constructors and overloading them
	public Human(int intelligence, int stealth, int strength, int health, String nameInput) {
		
		this.intelligence = 3;
		this.stealth = 3;
		this.strength = 3;
		this.health=100;
		this.name=nameInput;
	}
	
	
	public Human(String nameInput) {
		this.health=100;
		this.intelligence=3;
		this.name=nameInput;
	}
	
	
	
	
	

	//Getters and Setters //////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//Display Method////////////////////////////////
	public String displayEnergyLevel() {
		String result = String.format("This is a Warrior's Status: \n Health: %d energyLevel, and Warrior Name: %s", this.health, this.name);
		return result;
	}

}
