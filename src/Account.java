/**
 * This Account class is for the BankTeller, including 5 instance variables, one constructor, set methods, get methods and some display methods.
 * @author Yuhang Zhao, student number 150467199
 *
 */
public class Account {
	private String acctNames;
	private int acctNumbers;
	private double acctBalance;
	private String acctOpenDate; 
	private String acctLastT;
	
	public Account(String acct_Names, int acct_Numbers, String acct_OpenDate, String acct_LastT)
	{
		this.acctNames = acct_Names;
		this.acctNumbers = acct_Numbers;
		this.acctOpenDate = acct_OpenDate;
		this.acctLastT = acct_LastT;
		this.acctBalance = 0;
		
	}
	
	public void setacctNames(String acct_Names)
	{
		this.acctNames = acct_Names;
	}
	public void setacctNumbers(int acct_Numbers)
	{
		this.acctNumbers = acct_Numbers;
	}
	public void setacctBalance(double acct_Balance)
	{
		this.acctBalance = acct_Balance;
	}
	public void setacctLastT(String acct_LastT)
	{
		this.acctLastT = acct_LastT;
	}
	
	
	
	public String getacctNames()
	{
		return acctNames;
	}
	public int getacctNumbers()
	{
		return acctNumbers;
	}
	public double getacctBalance()
	{
		return acctBalance;
	}
	public String getacctLastT()
	{
		return acctLastT;
	}
	public String getacctOpenDate()
	{
		return acctOpenDate;
	}
	
	
	
	public double deposit(double money)
	{
		acctBalance = acctBalance + money;
		return acctBalance;
	}
	
	public double withdrawl(double money)
	{
		acctBalance = acctBalance - money;
		return acctBalance;
	}
	
	public void displayBalance()
	{
		System.out.printf("The balance is %.2f\n", getacctBalance());
	}
	
	public void displayOpenDate() 
	{
		System.out.printf("The opening date for this account with %d of %s is: %s\n", getacctNumbers(), getacctNames(), getacctOpenDate());
	}
	public void dispalyLastT() 
	{
		System.out.printf("The last transcation happens at %s\n", getacctLastT());
	}

}
