
public class DiscountBill extends VegetableBill {
	private boolean preferred; //To determine whether the customer should get the discount
	
	DiscountBill(Employee clerk, boolean preferred){
		super(clerk);
		this.preferred = preferred;
	}
	
	@Override
	public double getTotal() {
		double total = 0.0;
		for(Item item: items) {
			total = total + item.getPrice();
		}
		if(this.preferred)
			total = total - getDiscountAmount();
		return total;
	}
	
	public int getDiscountCount() { //To get the number of items that were discounted
		if(!this.preferred)
			return 0;
		int discountCount = 0;
		for(Item item: items) {
			if(item.getDiscount() > 0) {
				discountCount++;
			}
		}
		return discountCount;
	}
	
	public double getDiscountAmount() { //To get the total discount for the list of items
		if(!this.preferred)
			return 0.0;
		double totalDiscount = 0.0;
		for(Item item: items) {
			totalDiscount = totalDiscount + item.getDiscount();
		}
		return totalDiscount;
	}
	
	public double getDiscountPercent() { //To get the percent of the total discount as a percent of what the total would have been otherwise
		if(!this.preferred)
			return 0.0;
		double percent = (getDiscountAmount() * 100) / getTotal();
		return percent;
	}
}
