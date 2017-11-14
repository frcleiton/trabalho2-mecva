package br.edu.univas.si8.ta.customer.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.customer.ejb.entities.Customer;

@Stateless
public class CustomerDAO {
	
	@PersistenceContext(unitName = "estoque")
	private EntityManager em;
	
	public void insert (Customer customer) {
		em.persist(customer);
	}
	
	public List<Customer> listAll() {
		return em.createQuery("from customers c", Customer.class).getResultList();
	}

}
