package BasicJava;

public class BasketBallPlayer extends Athlete {
	private int shootingSkillLevel;
	

	public BasketBallPlayer(String firstNameInput, String lastNameInput, int shootingSkillLevelInput) {
		super(firstNameInput, lastNameInput);
		// TODO Auto-generated constructor stub
		this.shootingSkillLevel=shootingSkillLevelInput;
		this.stamina=25;
		
		
	}
	//Creating Own Method
	public void shootBall() {
		this.stamina -= 5;;
		if(this.shootingSkillLevel>50) {
			System.out.println("BAAAANGGGG");
		}else {
			System.out.println("Brick City tho");
		}
	}
	
	
	
	//Overiding method from Athlete Class w/protected instance 'stamina =25' and  + adding 1 extra element 'Shooting Element' from BasketBallPlayer
	public String displayStatus() {
		String result = String.format("This BasketBall Player Status  status is: \n Strength: %d, Speed: %d, Stamina: %d, First Name: %s, Last Name: %s, ShootingSkillLevel: %d",
				this.strength, this.speed, this.stamina, this.firstName, this.lastName, this.shootingSkillLevel);
		return result;
	}

	public int getShootingSkillLevel() {
		return shootingSkillLevel;
	}


	public void setShootingSkillLevel(int shootingSkillLevel) {
		this.shootingSkillLevel = shootingSkillLevel;
	}
	

}
