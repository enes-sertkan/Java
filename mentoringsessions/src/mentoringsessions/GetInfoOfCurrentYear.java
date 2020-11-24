package mentoringsessions;

import java.time.Year;

public class GetInfoOfCurrentYear {
	
	public static void main(String[] args) {
		
//		Current Year: 2020
//		Is current year leap year? false                                             
//		Length of the year: 365 days
		
		//Current year	
		Year yr = Year.now();
		
		//given year
		System.out.println("\nCurrent Year: " + yr);
		boolean isLeap = yr.isLeap(); // false
		System.out.println("Is current year leap year? " + isLeap); 
		int length = yr.length(); // 365
		System.out.println("Length of the year: " + length+" days\n"); 
	}

}
