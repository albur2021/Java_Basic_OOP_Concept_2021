package ObjectMaster;

public class Wizzard extends Human{
	private int currentLevel;
	public Wizzard(String nameInput) {
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
		this.currentLevel=this.getHealth()- this.getIntelligence();
		System.out.println(currentLevel);
		
	}

	
	

}
