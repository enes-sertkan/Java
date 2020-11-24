package day26encapsulationdt;

public class E03 {

	private int ccn = 123456789;
	private String disease = "Flu";
	private boolean old = false;
	
	public static void main(String[] args) {
		/*
		  1) Create 3 variables which are disease, credit card number, and old(boolean)
		  2) Encapsulate them all 
		  3) make the disease readable
		  4) make the credit card number update-able but not readable
		  5) make old update-able and readable
		*/
		
		
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setCcn(int ccn) {
		this.ccn = ccn;
	}
	
	public boolean getOld() {
		return old;
	}
	
	public void setold(boolean old) {
		this.old = old;
	}
	
	/*
	  If you don't want any data to be updatable DO NOT create SETTERS.
	  If all data of a class are encapsulated and no setter method is
	  created then the class is called "IMMUTABLE CLASS"
	*/
}
