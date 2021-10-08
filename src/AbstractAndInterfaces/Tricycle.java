package AbstractAndInterfaces;

public class Tricycle implements OperateBicycle {
	public int speed;
	
	public Tricycle() {
		this.speed=0;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		if(this.speed + increment >5) {
			System.out.println("Woow, that is too fast!");
		}else {
			this.speed +=increment;
				
			
		}
		
	}

	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		this.speed-=decrement;
		
	}

}
