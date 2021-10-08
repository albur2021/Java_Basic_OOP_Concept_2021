package ObjectMaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Wizzard object = new Wizzard("Wizzard");
	object.attack();
	System.out.println(object.displayEnergyLevel());
	System.out.println(object.getCurrentLevel());
	
	Ninja object1 = new Ninja("Ninja");
	object1.attack();
	System.out.println(object1.displayEnergyLevel());
	System.out.println(object1.getCurrentLevel());
	
	
	Samurai object2 = new Samurai("Samurai");
	object1.attack();
	System.out.println(object2.getCurrentLevel());
	System.out.println(object2.displayEnergyLevel());

	}


}
