package com.orderapp.dto;

import java.time.LocalDateTime;

public class Coupon {
	private int id;
	private String couponCode;
	private Integer discount;
	private LocalDateTime expDate;

	public Coupon() {
	}

	public Coupon(int id, String couponCode, Integer discount, LocalDateTime expDate) {
		this.id = id;
		this.couponCode = couponCode;
		this.discount = discount;
		this.expDate = expDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public LocalDateTime getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDateTime expDate) {
		this.expDate = expDate;
	}

}
