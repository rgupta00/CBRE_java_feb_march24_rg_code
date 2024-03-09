package com.orderapp.dto;

public class OrderRequest {
	private int cid;
	private int pid;
	private int qty;
	private String discountCoupon;
	
	public OrderRequest(int cid, int pid, int qty, String discountCoupon) {
		this.cid = cid;
		this.pid = pid;
		this.qty = qty;
		this.discountCoupon = discountCoupon;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDiscountCoupon() {
		return discountCoupon;
	}
	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}
	
	
	
	
}
