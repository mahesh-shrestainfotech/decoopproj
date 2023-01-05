package oopproj;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	
	LocalDate dateOfJoining;
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int id, String name, LocalDate dob, GenderType genderType, String email, String phone,
			LocalDate dateOfJoining) {
		super(id, name, dob, genderType, email, phone);
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("PermanentEmployee  : CalculateSalary()");
	}

}
