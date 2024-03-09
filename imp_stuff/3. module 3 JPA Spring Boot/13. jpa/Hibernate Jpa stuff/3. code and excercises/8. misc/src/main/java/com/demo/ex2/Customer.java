package com.demo.ex2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
//?
@Entity
@Table(name = "cust_table_temp",
uniqueConstraints = {@UniqueConstraint(columnNames = {"customerRegNo","customerEmail"})} )

public class Customer {
	@Id
	private int id;
	
	private int customerRegNo;
	private String customerEmail;
	
	private String customerName;
	private String customerAddess;

	public Customer() {
	}

	public Customer(int customerRegNo, String customerEmail, String customerName, String customerAddess) {
		this.customerRegNo = customerRegNo;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerAddess = customerAddess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerRegNo() {
		return customerRegNo;
	}

	public void setCustomerRegNo(int customerRegNo) {
		this.customerRegNo = customerRegNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
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
		return "Customer [id=" + id + ", customerRegNo=" + customerRegNo + ", customerEmail=" + customerEmail
				+ ", customerName=" + customerName + ", customerAddess=" + customerAddess + "]";
	}

	
	
}
