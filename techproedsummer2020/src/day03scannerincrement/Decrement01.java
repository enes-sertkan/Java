package day03scannerincrement;

public class Decrement01 {

	public static void main(String[] args) {
		//Decrement: To decrease the value of a variable
        int num = 10;
        System.out.println(num);
        //1. Way
        num = num - 3;
        System.out.println(num);
        //2. Way
        num-=2;
        System.out.println(num);
        //3. Way: To decrease value by 1
        num--;
        System.out.println(num);
        
        int num1 = 12;
        System.out.println(num1);
        
        //To increase we can use multiplication as well
        //1. Way
        num1 = num1 * 2;
        System.out.println(num1);
        
        //2. Way
        num1*=3;
        System.out.println(num1);
        
        //To Decrease we can use division
        //1. Way
        num1 = num1/6;
        System.out.println(num1);
        
        //2. Way
        num1/=2;
        System.out.println(num1);
	}

}
