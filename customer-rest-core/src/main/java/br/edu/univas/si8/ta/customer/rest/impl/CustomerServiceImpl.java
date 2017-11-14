package br.edu.univas.si8.ta.customer.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.customer.ejb.interfaces.Customer;
import br.edu.univas.si8.ta.customer.rest.api.CustomerService;

@RequestScoped
public class CustomerServiceImpl implements CustomerService{

	@EJB(mappedName="java:app/customer-rest-ejb-0.1-SNAPSHOT/CustomerBean!br.edu.univas.si8.ta.customer.ejb.interfaces.CustomerRemote")
	private Customer customer;
	
	
	@Override
	public String saveNewCustomer(String name, String email) {
		customer.createNewCustomer(name, email);
		return "{\"Message\": \"Success\"}";
	}

	@Override
	public String[] listCustomersNames() {
		return customer.listCustomerNames();
	}

}
