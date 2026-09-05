package com.Comparator;

public class EmpClass {
	
	int Emp_id;
	String Emp_name;
	int age;
	long salary;

	public EmpClass ( int Emp_id, String Emp_name, int age, long salary) {
		
		this.Emp_id = Emp_id;
		this.Emp_name = Emp_name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return Emp_id+" " + Emp_name +  " "+age+" "+salary;
		
	}
		
	}
	



