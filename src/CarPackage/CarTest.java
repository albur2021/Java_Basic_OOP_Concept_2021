package CarPackage;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car object = new Car(10,1,"BooGatti");
		object.drive(34);//2.0 = 50+10/25
		Car object1 = new Car(10000,25,"Camry");
		object1.drive(50);
//		object1.generateLicencePlateNumber(); is for testing purpose, was sent to 
		object.getLicencePlateNum();
		object.getLicencePlateNum();
		
		
		
		System.out.println(Car.totalCarsCreated);//2 - cars/objects created;
		System.out.println("Total number of mileage for all cars: " + Car.totalMileageForAllCars);

	}

}
