package com.singleton;

public class Demo 
{
	public static void main(String[] args) 
	{
		Employee emp1 = Employee.getEmployee();
		Employee emp2 = Employee.getEmployee();
		
		System.out.println(emp1==emp2);//true because same object
		
		//emp1 and emp2 hashcode will be same
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}

}
