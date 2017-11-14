package br.edu.univas.si8.ta.customer.ejb.interfaces;

public interface Customer {
	
	void createNewCustomer(String nameCustomer, String emailCustomer);
	
	String[] listCustomerNames(); 

}
