package ZooKeeper;

public class Bat extends Mammal{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bat(String nameInput) {
		super(nameInput);
		this.energyLevel += 200;
	}
	
	public void fly() {
		this.energyLevel-=50;
		
	}
	public void eatHumans() {
		this.energyLevel+=25;
	}
	public void attackTown() {
		this.energyLevel -=100;
	}
	
}
