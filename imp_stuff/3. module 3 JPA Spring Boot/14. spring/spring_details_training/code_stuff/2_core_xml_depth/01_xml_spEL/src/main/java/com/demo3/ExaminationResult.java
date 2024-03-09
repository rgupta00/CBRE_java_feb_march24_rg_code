package com.demo3;
public class ExaminationResult {
	private Boolean hasPassed;
	private String resultMessage;
	public Boolean getHasPassed() {
		return hasPassed;
	}
	public void setHasPassed(Boolean hasPassed) {
		this.hasPassed = hasPassed;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	@Override
	public String toString() {
		return "ExaminationResult [hasPassed=" + hasPassed + ", resultMessage=" + resultMessage + "]";
	}
	
	
}