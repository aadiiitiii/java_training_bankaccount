import java.util.Random;

public class BaseClass {
	private long accountBalance=25000;
	private int accountId;
	private BANK_TYPE acc_type;
	private Address address;
	
	enum BANK_TYPE {
		savings_account,
		current_account,
		salary_account
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BaseClass(int accountId) {
		this.accountId= accountId;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public void addMoney(int money) {
		this.accountBalance+= money;
		System.out.println("The balance is: "+this.accountBalance);
	}
	public void removeMoney(int money) {
		this.accountBalance-= money;
		System.out.println("The balance is: "+this.accountBalance);
	}
	public void checkBalance() {
		System.out.println("The balance is: "+this.accountBalance);
	}

	public BANK_TYPE getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(BANK_TYPE acc_type) {	
		this.acc_type = acc_type;
	}
	
	public void checkAccountType(String acc_type2) {
		int pick = new Random().nextInt(BANK_TYPE.values().length);
		acc_type= BANK_TYPE.values()[pick];
		System.out.println("The account type is: "+this.acc_type);
	}
}
