package e;

public class Invoice implements Payable {
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerPart;

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerPart() {
		return pricePerPart;
	}

	public void setPricePerPart(double pricePerPart) {
		this.pricePerPart = pricePerPart;
	}

	public Invoice(String partNum, String partDescription, int quantity, double pricePerPart) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerPart = pricePerPart;
	}

	@Override
	public double getPayment() {
		return quantity*pricePerPart;
	}

}
