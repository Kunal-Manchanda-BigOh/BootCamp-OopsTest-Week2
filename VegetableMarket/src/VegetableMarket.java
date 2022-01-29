import java.lang.*;

public class VegetableMarket {
	public static void main(String[] args) {
		Employee kunal = new Employee("Kunal", "9643986369");
		DiscountBill kunalDiscountBill = new DiscountBill(kunal, true);
		
		kunalDiscountBill.addItem(new Item("Onion", Constants.ONION_PRICE, Constants.ONION_DISCOUNT));
		kunalDiscountBill.addItem(new Item("Cucumber", Constants.CUCUMBER_PRICE, Constants.CUCUMBER_DISCOUNT));
		kunalDiscountBill.addItem(new Item("Garlic", Constants.GARLIC_PRICE, Constants.GARLIC_DISCOUNT));

		
		System.out.println(kunal.getName() + "'s Receipt");
		kunalDiscountBill.printReceipt();
		
		System.out.println("Total: " + kunalDiscountBill.getTotal());
		
		System.out.println("Discount Count: " + kunalDiscountBill.getDiscountCount());
		
		System.out.println("Discount Amount: " + kunalDiscountBill.getDiscountAmount());
		
		System.out.println("Discount Percentage: " + (double) Math.round(kunalDiscountBill.getDiscountPercent() * 100) / 100); //To get the percentage in two decimal places
		
		
		
		Employee kartik = new Employee("Kartik", "9643986369");
		DiscountBill kartikDiscountBill = new DiscountBill(kartik, false);
		
		kartikDiscountBill.addItem(new Item("Onion", Constants.ONION_PRICE, Constants.ONION_DISCOUNT));
		kartikDiscountBill.addItem(new Item("Ginger", Constants.GINGER_PRICE, Constants.GINGER_DICOUNT));
		kartikDiscountBill.addItem(new Item("Garlic", Constants.GARLIC_PRICE, Constants.GARLIC_DISCOUNT));
		kartikDiscountBill.addItem(new Item("Tomato", Constants.TOMATO_PRICE, Constants.TOMATO_DICOUNT));

		
		System.out.println(kartik.getName() + "'s Receipt");
		kartikDiscountBill.printReceipt();
		
		System.out.println("Total: " + kartikDiscountBill.getTotal());
		
		System.out.println("Discount Count: " + kartikDiscountBill.getDiscountCount());
		
		System.out.println("Discount Amount: " + kartikDiscountBill.getDiscountAmount());
		
		System.out.println("Discount Percentage: " + (double) Math.round(kartikDiscountBill.getDiscountPercent() * 100) / 100);
	}
}
