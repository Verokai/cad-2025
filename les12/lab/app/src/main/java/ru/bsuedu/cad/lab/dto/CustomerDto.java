package ru.bsuedu.cad.lab.dto;

public class CustomerDto {
	private int customerId;
	private String name;
	private String email;
	private String phone;
	private String address;

	public CustomerDto(int customerId, String name, String email, String phone, String address) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}