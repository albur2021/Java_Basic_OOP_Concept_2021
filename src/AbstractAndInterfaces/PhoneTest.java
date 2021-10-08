package AbstractAndInterfaces;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone object = new Iphone("x",100,"At&t","Sleigh Ride");
		object.displayInfo();
		
		System.out.println(object.unlock());
		
		Galaxy object1 = new Galaxy("DT100",100,"Verizon","Sport");
		object1.displayInfo();
		System.out.println(object1.unlock());
	}

}
