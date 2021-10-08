package BasicJava;

public class AthleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete object = new Athlete("Lebron","James");
		System.out.println(object.getFirstName());
		System.out.println(object.displayStatus());
		//This Athlete's status are: 
		 //Strength: 10, Speed: 10, Stamina: 10, First Name: Lebron, Last Name: James
		BasketBallPlayer player = new BasketBallPlayer("Stephen","Curry", 100);
		System.out.println(player.displayStatus());
		//This BasketBall Player Status  status is: 
		 //Strength: 10, Speed: 10, Stamina: 25, First Name: Stephen, Last Name: Curry, ShootingSkillLevel: 100
		BasketBallPlayer jordan = new BasketBallPlayer("Michael", "Jordan", 15);
		jordan.shootBall();
		player.shootBall();
		System.out.println(player.displayStatus());
		System.out.println(jordan.displayStatus());
		Swimmer phelps = new Swimmer("Maichael","Phelps",100);
		System.out.println(phelps.displayStatus());
		//This Swimmer's status are: 
		 //Strength: 10, Speed: 10, Stamina: 10, First Name: Maichael, Last Name: Phelps, Lung Capacity: 100
		Swimmer rockieswimmer = new Swimmer("somebody","not popular");
		System.out.println(rockieswimmer.displayStatus());
		//Swimmer constructor overloading
		//This Swimmer's status are: 
		 //Strength: 10, Speed: 10, Stamina: 10, First Name: somebody, Last Name: not popular, Lung Capacity: 50
		
		rockieswimmer.swim();
		System.out.println(rockieswimmer.displayStatus());
		//Swimming in salt water tho
		//This Swimmer's status are: 
		 //Strength: 10, Speed: 10, Stamina: 5, First Name: somebody, Last Name: not popular, Lung Capacity: 52

	}

}
