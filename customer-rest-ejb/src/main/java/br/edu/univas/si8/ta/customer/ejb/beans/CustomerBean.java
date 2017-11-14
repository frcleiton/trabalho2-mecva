package br.edu.univas.si8.ta.customer.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.customer.ejb.dao.CustomerDAO;
import br.edu.univas.si8.ta.customer.ejb.entities.Customer;
import br.edu.univas.si8.ta.customer.ejb.interfaces.CustomerLocal;
import br.edu.univas.si8.ta.customer.ejb.interfaces.CustomerRemote;


@Stateless
@Remote(CustomerRemote.class)
@Local(CustomerLocal.class)
public class CustomerBean implements CustomerRemote, CustomerLocal {

	@EJB
	private CustomerDAO dao;
	
	@Override
	public void createNewCustomer(String nameCustomer, String emailCustomer) {
		Customer customer = new Customer();
		customer.setName(nameCustomer);
		customer.setEmail(emailCustomer);
		dao.insert(customer);		
	}

	@Override
	public String[] listCustomerNames() {
		return dao.listAll()
				.stream()
				.map(Customer::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
