package com.Comparator;

import java.util.ArrayList;
import java.util.List;

public class employee {

	public static void main(String[] args) {
		
		 List <EmpClass> al = new ArrayList <>();
		 
		 EmpClass emp = new EmpClass(111,"Bhaaii",11, 25000);
		 al.add(emp);
		 al.add(new EmpClass(121,"prabhaa",25,35000));
		 al.add(new EmpClass(110,"Pawan kalyan",24,450000));
		 
		 
		 System.out.println(al);
		 
		 //CREATE
		 for(EmpClass e : al ) {
			 System.out.println(e); 
		 }
		 
		 // UPDATING
		 
		 for (EmpClass e : al) {
	            if (e.Emp_id == 121) {
	            	e.Emp_name = "Maheshh";
	                e.salary = 50000;
	     
	            } 
	        }
		 for(EmpClass e : al) {
			 System.out.println(e);
		 }
		

	}

}
