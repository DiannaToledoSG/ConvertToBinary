package edu.cgcc.cs160.driver;
import edu.cgcc.cs160.people.*;

public class Main {

	public static void main(String[] args) {
		
		Student[] sArray = new Student[] {
				new Student("John Smith" , 21 , 5),
				new Student("Bob Doe" , 19 , 9),
				new Student("Jane Brinker" , 25 , 6)
		};
		Instructor instructor = new Instructor ("Richard Gear" , 45, 6);
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].printInformation();
			
		}
		for(int i = 0; i < sArray.length; i++) {
			if(sArray[i].getName() == "John Smith") {
				sArray[i].gpa = 4;
		}
			System.out.println();
			for(int i = 0 ; i< sArray.length; i++) {
				sArray[i].printInformation();
			}
			
			
			}
		}
	}



