package day26encapsulationdt;

public class E02 {

	public static void main(String[] args) {
		E01 obj1 = new E01();
		//System.out.println(obj1.ssn);
		//System.out.println(obj1.name); cannot access becuase originally they are private
		System.out.println(obj1.retired);//false

		System.out.println(obj1.getSsn());//123456789
		System.out.println(obj1.getName());//Enes Sertkan
		
		//Before updating salary
		System.out.println(obj1.getSalary());//80000
		//Updating
		obj1.setSalary(90000);
		//After updating salary
		System.out.println(obj1.getSalary());//90000
		
		//Create an object from E03 Class
		E03 obj2 = new E03();
		System.out.println(obj2.getDisease());
		System.out.println(obj2.getOld());
	}

}
