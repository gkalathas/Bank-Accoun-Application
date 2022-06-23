
public class Savings extends Account {
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	public Savings(String name, String sSN, double initDeposit) { 
		super(name, sSN, initDeposit);
		accountNumber = "1 "+ accountNumber;
		System.out.println("ACCOUNT NUMBER: "+ this.accountNumber);
		setSafetyDepositBox();
			
	}
	
	@Override
	public void setRate() {
		
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInformation();
		System.out.println("ACCOUNT TYPE: Savings");
		System.out.println(
				"Your savings account features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID+
				"\n Safety Deposit Box Key: "+ safetyDepositBoxKey
		
				);
	}


}
