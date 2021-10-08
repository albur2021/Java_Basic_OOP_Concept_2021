package ZooKeeper;

public class Gorilla extends Mammal {
	

	public Gorilla(String nameInput) {
		super(nameInput);
		// TODO Auto-generated constructor stub
	}

		
	public void eatBananas() {
		this.energyLevel+=10;
	}
	
	
	public void throwSomething() {
		this.energyLevel -=5;
	}
	
	public void climb() {
		this.energyLevel-=10;
	}

}
