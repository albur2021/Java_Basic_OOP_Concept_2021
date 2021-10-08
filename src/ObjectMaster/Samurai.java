package ObjectMaster;



public class Samurai extends Human{
	private int currentLevel;
	public Samurai(String nameInput) {
		super(nameInput);
		// TODO Auto-generated constructor stub
	}

	

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public void attack() {
		this.currentLevel=this.getHealth()- this.getStrength();
		System.out.println(currentLevel);
		
	}
	
}
