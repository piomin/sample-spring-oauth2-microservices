package pl.piomin.services.account.model;

public class Account {

	private Integer id;
	private Integer customerId;
	private String number;
	private int amount;

	public Account() {

	}

	public Account(Integer id, Integer customerId, String number, int amount) {
		this.id = id;
		this.customerId = customerId;
		this.number = number;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
