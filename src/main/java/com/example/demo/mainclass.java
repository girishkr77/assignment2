package com.example.demo;

public class mainclass {
	public static void main(String[] args) {
		student ob = new student();
		ob.setAge(4);
		ob.setName("ram");
		ob.setCity("bangalore");
		
		ob.setAge(5);
		ob.setName("surya");
		ob.setCity("bangalore");
		
		
		System.out.println("age: "+ ob.getAge());
		System.out.println("age: "+ ob.getName());
		System.out.println("age: "+ ob.getCity());
	}

}
