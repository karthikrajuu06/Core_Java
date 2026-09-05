package com.objectorientedprogramming;

public class Employee {
	int emp_id;
	String Name;
	double salary;
	

	static {
		
	String	companyName = "ABC Technologies";
	System.out.println(companyName+"\n");
	System.out.println("Company Information Loaded");	
	}
	{
		System.out.println("Employee Object Created");
	}
         
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.emp_id = 101;
		emp1.Name = "rahul ";
		emp1.salary = 4000.0;
	
		Employee emp2 = new Employee();
		emp1.emp_id = 112;
		emp2.Name = "sneha";
		emp2.salary  = 4500.00;
			
        System.out.println();
		System.out.println(emp1.emp_id);
		System.out.println(emp1.Name);
		System.out.println(emp1.salary);
		
		System.out.println();
		System.out.println(emp2.emp_id);
		System.out.println(emp2.Name);
		System.out.println(emp2.salary);
	}

}
