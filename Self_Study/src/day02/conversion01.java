package day02;

public class conversion01 {

	public static void main(String[] args) {
		
		//15
		double num1 = 100.235;
		int num2 = (int) num1;
		System.out.println(num2);
		
		//16
		int n1 = 5;
		double n2 = 6.2;
		System.out.println("\n" + n1 + n2);

		//17
		int nm1 = 5;
		nm1++;
		System.out.println("\n" + nm1);
		nm1 = nm1 + 1;
		System.out.println(nm1);
		nm1+= 1;
		System.out.println(nm1);
		
		//18
		int nm2 = 5;
		nm2--;
		System.out.println("\n" + nm2);
		nm2 = nm2 - 1;
		System.out.println(nm2);
		nm2-= 1;
		System.out.println(nm2);
	}

}
