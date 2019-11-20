package edu.cgcc.cs160.people;

abstract class Person {
	//members
	protected String name;
	protected int height;
	protected int age;
	
	//constructor
	
	//member functions
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printInformation() {
		System.out.println(name + ", " + height +", "+ age);
	}
}
