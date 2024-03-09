package com.demo.ex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_table")
public class Customer {
	@Id
	private CustomerKey customerKey;
	private String customerName;
	private String customerAddess;

	public Customer() {
	}

	public Customer(CustomerKey customerKey, String customerName, String customerAddess) {
		this.customerKey = customerKey;
		this.customerName = customerName;
		this.customerAddess = customerAddess;
	}

	public CustomerKey getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(CustomerKey customerKey) {
		this.customerKey = customerKey;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddess() {
		return customerAddess;
	}

	public void setCustomerAddess(String customerAddess) {
		this.customerAddess = customerAddess;
	}

	@Override
	public String toString() {
		return "Customer [customerKey=" + customerKey + ", customerName=" + customerName + ", customerAddess="
				+ customerAddess + "]";
	}

	
	
}
