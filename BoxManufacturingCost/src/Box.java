
public class Box {
	private String type; //To hold the type of box(Universal, AllFlapMeeting, HoneyComb, ReverseTuckIn or TopOpeneingSnapLock)
	private double length; //To hold the length of box
	private double height; //To hold the height of box
	private double width; //To hold the width of box
	private Flute flute; //To hold the flute
	private String partType; //To hold the type of box(Single or Double)
	private Joining joining; //To hold Pasting or Pins object
	
	Box(String type, double length, double height, double width, Flute flute, String partType, Joining joining){ //Constructor
		this.type = type;
		this.length = length;
		this.height = height;
		this.width = width;
		this.flute = flute;
		this.partType = partType;
		this.joining = joining;
	}
	
	public double getArea() { //To get the area of box
		return length*width*height;
	}
	
	public String getType() { //To return the type of box
		return type; 
	}
	
	public double calculateCost() { //To calculate cost of a box
		double stitchingCost = joining.getCost(); //Getting the stitching cost
		if(partType.equals("Double")) { //If the box is double type, then the stitching cost is multiplied by 3
			stitchingCost = stitchingCost*3;
		}
		double totalCost = getArea() * flute.getTotalGsm() * flute.getExtraGsm() * stitchingCost; //Calculating total cost
		return totalCost;
	}
}
