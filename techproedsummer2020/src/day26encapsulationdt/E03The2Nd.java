package day26encapsulationdt;

public class E03The2Nd {

	private int ccn = 123456789;
	private String disease = "Flu";
	private boolean old = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//If the data type of encapsulated data is boolean do not use "get" for the getter
	//method name
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

	public String getDisease() {
		return disease;
	}

	public void setCcn(int ccn) {
		this.ccn = ccn;
	}

}
