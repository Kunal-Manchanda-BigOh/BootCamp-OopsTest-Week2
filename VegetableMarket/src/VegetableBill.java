import java.util.*;

public class VegetableBill {
	ArrayList<Item> items; //To hold the list of items
	Employee clerk; //To hold the employee for whom the bill is generated
	
	VegetableBill(Employee clerk){ //Constructor
		this.clerk = clerk;
		this.items = new ArrayList<Item>();
	}
	
	public Employee getClerk() { //To get the employee
		return clerk;
	}
	
	public void addItem(Item item) { //To add item to the list
		items.add(item);
	}
	
	public double getTotal() { //To get the total cost of items
		double total = 0.0;
		for(Item item: items) {
			total = total + item.getPrice();
		}
		return total;
	}
	
	public void printReceipt() { //To print the list of items
		for(Item item: items) {
			System.out.println(item.getItemName());
		}
	}
}
