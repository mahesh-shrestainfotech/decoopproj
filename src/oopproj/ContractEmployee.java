package oopproj;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	
	LocalDate contractStartDate;
	LocalDate contractEndDate;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, LocalDate dob, GenderType genderType, String email, String phone,LocalDate contractStartDate, LocalDate contractEndDate) {
		super(id, name, dob, genderType, email, phone);
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("ContractEmployee  : CalculateSalary()");
	}
	

}

