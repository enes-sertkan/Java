package day43lambda;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class L03 {

	public static void main(String[] args) {
		
		//Create 4 objects by using Course class
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		//Add the int a list
		List<Course> list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		System.out.println(list);
		
		//Check if all average scores are greater than 98
		boolean result1 = list.stream()
		                      .allMatch(t->t.getAverageScore()>98);
		
		System.out.println(result1);
		
		//Check if all course names contain "Day" word
		boolean result2 = list.stream()
				              .allMatch(t->t.getCourseName().contains("Day"));
		
		System.out.println(result2);
		
		//Check if any number of students is 154
		boolean result3 = list.stream()
	              .anyMatch(t->t.getNumberOfStudents()==154);
		
		System.out.println(result3);
		
		//Check if any season is winter
		boolean result4 = list.stream()
	              .anyMatch(t->t.getSeason().equals("Winter"));
		
		System.out.println(result4);
		
		//Check if no number of students 100
		boolean result5 = list.stream()
				              .noneMatch(t->t.getNumberOfStudents()==100);
		
		System.out.println(result5);
		
		//Sort the elements in natural order according to the average score
		list.stream()
			.sorted(Comparator.comparing(t->t.getAverageScore()))
			.forEach(t->System.out.println(t + " "));
		
		System.out.println("=================================");
		
		//Sort the elements in reverse order according to the number of students
		list.stream()
		    .sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
		    .forEach(t->System.out.println(t + " "));
		
		System.out.println("==================================");
		
		//Sort the elements in reverse according to the course name
		list.stream()
	    .sorted(Comparator.comparing(Course::getCourseName).reversed())
	    .forEach(t->System.out.println(t + " "));
	}
}
