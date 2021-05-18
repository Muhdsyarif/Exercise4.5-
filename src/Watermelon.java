
public class Watermelon extends Fruits implements calcPrice  {	// Orange as a sub class extends of Fruits

	private String colour, taste;
	private double price, weight, discount;
	private int quantity;
	
	public Watermelon(String name, String colour, String taste, double price,double weight, int quantity) {
		super(name);
		this.colour = colour;
		this.taste = taste;
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
			double pr = 15;
			discount = 0.10;
			totalPrice(pr);
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total Price \t: RM%.2f",totalPrice(pr));
		}
		else if(this.quantity == 15){
			double pr = 25;
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
	
	public double weight() {
		return weight;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() {
		return ("\nName \t\t: " + super.getName() + 
				"\nColour \t\t: " + this.colour +
				"\nTaste \t\t: " + this.taste +
				"\nWeight \t\t: " + this.weight + "kg");
	}
	
	
}
