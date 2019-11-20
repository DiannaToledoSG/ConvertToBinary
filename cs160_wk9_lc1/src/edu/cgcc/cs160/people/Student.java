package edu.cgcc.cs160.people;

public class Student extends Person {
		//members
	public int gpa;
	public int loanBalance;

		//constructor
	public Student(String n, int a, int h) {
		name = n;
		age = a;
		height = h;
	}
	//member functions
	public void printInformation() {
		System.out.println(name + ", " + height +", "+ age + ", " + gpa);
}
}
