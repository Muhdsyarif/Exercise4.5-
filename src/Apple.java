
public class Apple extends Fruits implements calcPrice {		// Apple as a sub class extends of Fruits

	private String colour, taste;
	protected double price, weight, discount;
	
	
	public Apple(String name,String colour,String taste, double price, double weight) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
		this.weight = weight;
		calcPrice();
	}
	
	public void calcPrice() {
		if(this.weight <= 2) {
			totalPrice();
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal Price \t: RM%.2f",totalPrice());
		}
		else if(this.weight > 2 && this.weight <= 10) {
			double pr = 5.00;
			discount = 0.2;
			totalPrice(pr);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal Price \t: RM%.2f",totalPrice(pr));
		}
		else {
			double pr = 3;
			double w = this.weight;
			discount = 0.3;
			totalPrice(pr,w);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal Price \t: RM%.2f",totalPrice(pr,w));
		}
	}
	
	public double totalPrice() { //overloading method
		return this.price*this.weight;
	}
	
	public double totalPrice(double pr) { //overloading method
		return pr*this.weight*(1-discount);
	}
	
	public double totalPrice(double pr, double w) { //overloading method
		return pr*w*(1-discount);
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() { //overriding method
		return("\nName \t\t: " + super.getName() + 
				"\nColour \t\t: " + this.colour +
				"\nTaste \t\t: " + this.taste);
	}
	

}
