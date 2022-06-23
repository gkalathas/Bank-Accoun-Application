
public class Checking extends Account {
	
	//list properties for checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	
	//constructor
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+ accountNumber;
		System.out.println("ACCOUNT NUMBER: "+ this.accountNumber);
		setDebitCard();
	
	}
	@Override
	public void setRate() {
		rate = getBaseRate()* .15;
		
		
	}
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random()* Math.pow(10, 12));
		debitCardPin = (int)(Math.random()* Math.pow(10, 4));
	}
	
	
	//list methods speck for the checking account
	public void showInfo() {
		super.showInformation();
		System.out.println("Your checking account features"+
				"\nDebit Card Number: " + debitCardNumber +
				"\nDbit Card Pin: " + debitCardPin
		);
	}

}
