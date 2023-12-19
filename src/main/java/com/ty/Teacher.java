package com.ty;

public class Teacher {
	private String name;
	private int age;
	private double height;
	
	public Teacher(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void printDetails() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Height is :"+height);
	}
	
	

}
