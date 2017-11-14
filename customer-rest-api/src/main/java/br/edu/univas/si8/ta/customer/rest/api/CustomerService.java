package br.edu.univas.si8.ta.customer.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public interface CustomerService {
	
	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listCustomersNames();
	
	@POST
	@Path("/{name}/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewCustomer(@PathParam("name") String name, @PathParam("email") String email);
	
}
