package ZooKeeper;

public class Mammal {
	//create instance
	protected int energyLevel;
	private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//create constructor w/ =100 by default
	public Mammal(String nameInput) {
		this.name=nameInput;
		this.energyLevel = 100;
	}
	//create getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	//create setter
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	// create display method
	public String displayEnergyLevel() {
		String result = String.format("This is a Energy Level Status: \n Energy Level: %d energyLevel, and Mammal Name: %s", this.energyLevel, this.name);
		return result;
	}
}
