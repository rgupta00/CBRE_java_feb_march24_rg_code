package com.demo.ex;

import java.io.Serializable;

import javax.persistence.Embeddable;
//ideally this class must be immutable!
@Embeddable
public class CustomerKey implements Serializable{
	private static final long serialVersionUID = 1L;
	private int customerId;
	private String customerRegistrationId;
	public CustomerKey() {}
	public CustomerKey(int customerId, String customerRegistrationId) {
		this.customerId = customerId;
		this.customerRegistrationId = customerRegistrationId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerRegistrationId() {
		return customerRegistrationId;
	}
	public void setCustomerRegistrationId(String customerRegistrationId) {
		this.customerRegistrationId = customerRegistrationId;
	}
	@Override
	public String toString() {
		return "CustomerKey [customerId=" + customerId + ", customerRegistrationId=" + customerRegistrationId + "]";
	}
	
	

}
