package br.edu.univas.si8.ta.customer.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "customers")
@SequenceGenerator(name = "seq_customers", sequenceName = "seq_customers", allocationSize = 1)

public class Customer {

	@Id
	@GeneratedValue(generator = "seq_customers", strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private String name;
	private String email;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



}
