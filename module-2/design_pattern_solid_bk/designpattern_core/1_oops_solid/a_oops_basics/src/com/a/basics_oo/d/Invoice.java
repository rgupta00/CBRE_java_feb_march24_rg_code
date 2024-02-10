package com.a.basics_oo.d;

import java.util.UUID;

public class Invoice implements Payable{

	private String invoiceId;
	private String vendorName;
	private double ratePerHr;
	private double numbersOfHr;

	public Invoice(String vendorName, double ratePerHr, double numbersOfHr) {
		this.invoiceId = UUID.randomUUID().toString();
		this.vendorName = vendorName;
		this.ratePerHr = ratePerHr;
		this.numbersOfHr = numbersOfHr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [invoiceId=").append(invoiceId).append(", vendorName=").append(vendorName)
				.append(", ratePerHr=").append(ratePerHr).append(", numbersOfHr=").append(numbersOfHr).append("]");
		return builder.toString();
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public double getRatePerHr() {
		return ratePerHr;
	}

	public void setRatePerHr(double ratePerHr) {
		this.ratePerHr = ratePerHr;
	}

	public double getNumbersOfHr() {
		return numbersOfHr;
	}

	public void setNumbersOfHr(double numbersOfHr) {
		this.numbersOfHr = numbersOfHr;
	}

	@Override
	public double getPay() {
		return ratePerHr*numbersOfHr;
	}

}
