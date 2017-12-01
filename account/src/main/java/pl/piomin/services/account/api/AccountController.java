package pl.piomin.services.account.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.account.model.Account;

@RestController
public class AccountController {

	@GetMapping("/{id}")
	@PreAuthorize("#oauth2.hasScope('read')")
	public Account findAccount(@PathVariable("id") Integer id) {
		return new Account(id, 1, "123456789", 1234);
	}

	@GetMapping("/")
	@PreAuthorize("#oauth2.hasScope('read')")
	public List<Account> findAccounts() {
		return Arrays.asList(new Account(1, 1, "123456789", 1234), new Account(2, 1, "123456780", 2500),
				new Account(3, 1, "123456781", 10000));
	}

}
