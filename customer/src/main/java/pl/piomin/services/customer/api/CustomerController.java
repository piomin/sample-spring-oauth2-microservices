package pl.piomin.services.customer.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.customer.model.Customer;

@RestController
public class CustomerController {

	@GetMapping("/")
	@PreAuthorize("#oauth2.hasScope('read')")
	public Customer findCustomer() {
		return new Customer(1, "John Smith", 33);
	}
	
}
