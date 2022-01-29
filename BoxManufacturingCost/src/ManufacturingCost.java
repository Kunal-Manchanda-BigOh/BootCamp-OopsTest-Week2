
public class ManufacturingCost {
	public static void main(String[] args) {
		Box universal = new Universal(12.0, 15.0, 20.0, new TypeAFlute(100), "Single", new Pasting(Constants.UNIVERSAL_PASTING_COST));
		
		Box allFlapMeeting = new AllFlapMeeting(12.0, 15.0, 20.0, new TypeBFlute(220), "Double", new Pasting(Constants.ALL_FLAP_MEETING_PASTING_COST));
		
		Box honeyComb = new HoneyComb(12.0, 15.0, 20.0, new TypeBFlute(350), "Single", new Pins(200));
		
		Box reverseTuckIn = new ReverseTuckIn(12.0, 15.0, 20.0, new TypeCFlute(90), "Single", new Pasting(Constants.REVERSE_TUCK_IN_PASTING_COST));
		
		Box topOpeningSnapLock = new TopOpeningSnapLock(12.0, 15.0, 20.0, new TypeEFlute(80), "Double", new Pasting(Constants.TOP_OPENING_SNAP_LOCK_PASTING_COST));
		
		displayCost(universal);
		displayCost(allFlapMeeting);
		displayCost(honeyComb);
		displayCost(reverseTuckIn);
		displayCost(topOpeningSnapLock);
	}
	
	public static void displayCost(Box box) {
		System.out.println(box.getType() + ":" + box.calculateCost());
	}
}
