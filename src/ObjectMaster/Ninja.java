package ObjectMaster;


public class Ninja extends Human{
	private int currentLevel;
	public Ninja(String nameInput) {
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
		this.currentLevel=this.getHealth()- this.getStealth();
		System.out.println(currentLevel);
		
	}
	
}

