
public abstract class Fruits {	// Fruits as a parent class

protected String name;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println("\n\t===== "+this.name+" constructor is invoked =====");
	}

	//Getter
	public String getName() {
		return this.name;
	}
	
	public abstract double totalPrice();
	public abstract String toString();
	
}
