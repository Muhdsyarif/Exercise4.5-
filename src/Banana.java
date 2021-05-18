
public class Banana extends Fruits implements calcPrice {	// Banana as a sub class extends of Fruits

	private String colour;
	private double price, weight, discount;
	private int quantity;
	
	public Banana(String name, String colour, double price,double weight, int quantity) {
		super(name);
		this.colour = colour;
		this.price = price;
		this.weight = weight;
		this.quantity = quantity;
		calcPrice();
	}
	
	public void calcPrice() {
		if(this.quantity <=1 ) {
			totalPrice();
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total Price \t: RM%.2f",totalPrice());
		}
		else if(this.quantity == 10) {
			double pr = 75;
			discount = 0.10;
			totalPrice(pr);
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total Price \t: RM%.2f",totalPrice(pr));
		}
		else if(this.quantity == 15){
			double pr = 100;
			double qq = this.quantity;
			discount = 0.15;
			totalPrice(pr,qq);
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total Price \t: RM%.2f",totalPrice(pr,qq));
		}
		else {
			System.out.println("-------Please come again-------");
		}	
	}
	
	public double totalPrice() { //overloading method
		return this.price*this.quantity;
	}
	
	public double totalPrice(double pr) { //overloading method
		return pr*this.quantity*(1-discount);
	}
	
	public double totalPrice(double pr, double qq) { //overloading method
		return pr*qq*(1-discount);
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public double weight() {
		return weight;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}

	public String toString() { //overriding method
		return("\nName \t\t: " + super.getName() + 
					"\nColour \t\t: " + this.colour + 
					"\nWeight \t\t: " + this.weight + "kg");
	}			
}
