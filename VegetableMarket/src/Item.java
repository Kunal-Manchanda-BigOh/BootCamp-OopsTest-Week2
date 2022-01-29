
public class Item {
	private String name; //To hold the name of item
	private double price; //To hold the price of item
	private double discount; //To hold the discount of item
	
	Item(String name, double price, double discount){ //Constructor
		this.name = name;
		this.price = price; 
		this.discount = discount;
	}
	
	public String getItemName() { //To get the name of item
		return name;
	}
	
	public double getPrice() { //To get the price of item
		return price;
	}
	
	public double getDiscount() { //To get the discount of item
		return discount;
	}
}
