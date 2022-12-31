package oopproj;

import java.time.LocalDate;

public class TestCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.setId(101);
		customer.setName("Madhuri");
		customer.setDob(LocalDate.of(1990, 6, 20));
		customer.setGender(GenderType.FEMALE);
		
		System.out.println("Id   : "+customer.getId());
		System.out.println("Name : "+customer.getName());
		System.out.println("Dob  : "+customer.getDob());
		System.out.println("Gender: "+customer.getGender());

	}

}
