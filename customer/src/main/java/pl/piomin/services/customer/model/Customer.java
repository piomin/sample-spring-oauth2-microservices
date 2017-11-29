package pl.piomin.services.customer.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private Integer id;
	private String name;
	private int age;
	private List<Account> accounts = new ArrayList<Account>();

	public Customer() {

	}
	
	public Customer(Integer id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
