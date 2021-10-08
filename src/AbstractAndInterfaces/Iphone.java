package AbstractAndInterfaces;

public class Iphone extends Phone implements Ringalble{

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		System.out.println("");
		return "Iphone" + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
		String info = String.format("The Iphone's info: \n Version Number: %s, Battery Percentage:%d, Carrier %s, Rington: %s ",this.getVersionNumber(),this.getBatteryPercentage(),this.getCarrier(), this.getRingTone());
		System.out.println(info);
				
	}
	
	

}
