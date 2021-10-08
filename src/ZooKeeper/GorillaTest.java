package ZooKeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla object = new Gorilla("Gorrila");
		object.throwSomething();
		System.out.println(object.displayEnergyLevel());
		object.eatBananas();
		System.out.println(object.displayEnergyLevel());
		object.climb();
		System.out.println(object.displayEnergyLevel());
		
		Bat newBeast = new Bat("Dissaster");
		System.out.println(newBeast.displayEnergyLevel());
		newBeast.fly();
		newBeast.attackTown();
		newBeast.eatHumans();
		System.out.println(newBeast.displayEnergyLevel());
		
		
	}
	

}
