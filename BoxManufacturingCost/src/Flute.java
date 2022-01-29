
public class Flute {
	private int gsm; //To hold the gsm
	private int extraGsm; //To hold the extra gsm
	
	Flute(int gsm, int extraGsm){ //Constructor
		this.gsm = gsm;
		this.extraGsm = gsm;
	}
	
	public int getGsm() { //To get the gsm
		return gsm;
	}
	
	public int getExtraGsm() { //To get extra gsm
		return extraGsm;
	}
	
	public int getTotalGsm() { //To get total gsm
		return extraGsm + gsm * 100;
	}
}
