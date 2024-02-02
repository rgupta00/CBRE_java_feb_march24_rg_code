package e;

public class PaymentProcessingSystem {
	
	public static void processPayment(Payable payable) {
		//logic to process payment to database
		//
		System.out.println("payment of total: "+ payable.getPayment()+" is processed");
	}

}
