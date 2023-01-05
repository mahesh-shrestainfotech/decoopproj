package oopproj;

import java.time.LocalDate;

abstract public class Employee {

	int id;
	String name;
	LocalDate dob;
	GenderType genderType;
	String email;
	String phone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, LocalDate dob, GenderType genderType, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.genderType = genderType;
		this.email = email;
		this.phone = phone;
	}
	
	abstract public void calculateSalary() ;
	
	public void getDetails() {
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		System.out.println("Dob  : "+dob);
	}
}
