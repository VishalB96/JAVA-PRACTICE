/**
 * 
 */
//package BankPack1;

/**
 * @author Vishal
 *
 */
public abstract class Accounts {
	private double MinimumBalance;
	private double CurrentBalance;
	private static long AccountNumber= 100000;
	private String Name,Address;

	{AccountNumber++;}
	
	/**
	 * 
	 */
	public Accounts() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the minimumBalance
	 */
	public double getMinimumBalance() {
		return MinimumBalance;
	}

	/**
	 * @param minimumBalance the minimumBalance to set
	 */
	public void setMinimumBalance(double minimumBalance) {
		MinimumBalance = minimumBalance;
	}

	/**
	 * @return the currentBalance
	 */
	public double getCurrentBalance() {
		return CurrentBalance;
	}

	/**
	 * @param currentBalance the currentBalance to set
	 */
	public void setCurrentBalance(double currentBalance) {
		CurrentBalance = currentBalance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the accountNumber
	 */
	public static long getAccountNumber() {
		return AccountNumber;
	}
	abstract void DisplayBalance();
	abstract void Deposit(double amount);
	abstract void Withdraw(double amount);
	
}
/*------------------------------------------------SAVINGS ACCOUNT CLASS---------------------------------------------------*/
class Savings extends Accounts{
	private long SavingAccountNumber;

	public Savings (){
		this.setName("NONAME");
		this.setAddress("NOADDRESS");
		this.SavingAccountNumber = Accounts.getAccountNumber();
	}
	public Savings(String Name , String Address) {
		this.setName(Name);
		this.setAddress(Address);
		this.SavingAccountNumber = Accounts.getAccountNumber();
	}
	
	/**
	 * @return the savingAccountNumber
	 */
	public long getSavingAccountNumber() {
		return SavingAccountNumber;
	}
	

	@Override
	void DisplayBalance() {
		System.out.println("ACC NO"+this.getSavingAccountNumber());
		System.out.println("Name : "+ this.getName());
		System.out.println("Current Balance : "+this.getCurrentBalance());
		System.out.println("--------------------------------------------------");
		
	}

	@Override
	void Deposit(double amount) {
		double temp = this.getCurrentBalance();
		temp+= amount;
		this.setCurrentBalance(temp);
		
	}

	@Override
	void Withdraw(double amount) {
		double temp = this.getCurrentBalance();
		temp-=amount;
		this.setCurrentBalance(temp);
		
	}
}


/*---------------------------------------------------CURRENT ACCOUNT CLASS------------------------------------------*/

class Current extends Accounts{
	
	private long CurrentAccountNumber;

	public Current(){
		this.setName("NONAME");
		this.setAddress("Noaddress");
		this.CurrentAccountNumber = Accounts.getAccountNumber();
	}

	public Current(String Name, String Address) {
		this.setName(Name);
		this.setAddress(Address);
		this.CurrentAccountNumber = Accounts.getAccountNumber();
	}
	public long getCurrentAccountNumber() {
		return CurrentAccountNumber;
	}
	@Override
	void DisplayBalance() {
		System.out.println("ACC NO"+this.getCurrentAccountNumber());
		System.out.println("Name : "+ this.getName());
		System.out.println("Current Balance : "+this.getCurrentBalance());
		System.out.println("--------------------------------------------------");
		
	}

	@Override
	void Deposit(double amount) {
		double temp = this.getCurrentBalance();
		temp+= amount;
		this.setCurrentBalance(temp);
		
	}

	@Override
	void Withdraw(double amount) {
		double temp = this.getCurrentBalance();
		temp-=amount;
		this.setCurrentBalance(temp);
		
	}
	
	
}
