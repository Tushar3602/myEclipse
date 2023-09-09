package newphase;	

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1 ","Hydrabad","50036");
		Customer customer = new Customer("Tushar",homeAddress);
		
		System.out.println(customer);

		Address workAddress = new Address("line1 for work","Hydrabad","50031");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		
		
		
		
		
		
	}

}
