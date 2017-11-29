package pl.piomin.services.customer.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.customer.client.AccountClient;
import pl.piomin.services.customer.model.Customer;

@RestController
public class CustomerController {

	private final static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	AccountClient accountClient;
	
	@GetMapping("/{id}")
	@PreAuthorize("#oauth2.hasScope('read')")
	public Customer findCustomer(@PathVariable("id") Integer id) {
		Customer c = new Customer(id, "John Smith", 33);
		LOGGER.info("Customer found: id={}", c.getId());
		c.setAccounts(accountClient.findAccounts());
		LOGGER.info("Accounts found: size={}", c.getAccounts().size());
		return c;
	}
	
}
