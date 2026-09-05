package com.objectorientedprogramming;

public class Student {
	int student_id;
	String  student_name;

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.student_id = 111;
		std1.student_name = " Raju";
		
		Student std2 = new Student();
		std2.student_id = 118;
		std2.student_name = "karthek";
		
		System.out.println(std1.student_id+" "+std1.student_name);
		
	}

}
