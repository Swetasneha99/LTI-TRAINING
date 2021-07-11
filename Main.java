 class Account {
	private int accountNo;  //data member
	private double accountBalance;
	private String accountPassword;
	public static String bankName;
	
	public Account()
	{
		System.out.println("Default constructor called...");
		
	}
	
	public Account (int accountNo,double accountBalance, String accountPassword,String bankName )
	{
		this.accountNo = accountNo ;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		Account.bankName = bankName;
	}
	
	public void displayAccount()
	{
		System.out.println("--------------------------------");
		System.out.println("ACNO : "+accountNo);
		System.out.println("BALANCE : "+accountBalance);
		System.out.println("PASSWORD : "+accountPassword);
		System.out.println("BANKNAME : "+Account.bankName);
		System.out.println("--------------------------------");
	}
	
	

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	
}
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.setAccountNo(105);
		acc.setAccountBalance(500000);
		acc.setAccountPassword("abcds234");
		acc.setBankName("HDFC Bank");
		acc.displayAccount();	

	}

}
