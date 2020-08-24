package BankPack1;

public class BankApp {
	
	public static void DisplayBalance(Accounts ref) {
		
		
		ref.DisplayBalance();
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BankA();
		Savings s1 = new Savings("VISHAL", "VIrar" );
		Savings s2 = new Savings("Vishal2","JUHU");
		DisplayBalance(s1);
		s1.Deposit(2000);
		DisplayBalance(s1);
		s1.Deposit(2000);
		DisplayBalance(s2);
		s2.Deposit(3000);
		DisplayBalance(s2);
		s2.Withdraw(100);
		DisplayBalance(s2);
		s1.Withdraw(211);
		DisplayBalance(s1);
		Current c1 = new Current("VISHAL CURRENT", "VIRAR");
		c1.Deposit(29999);
		DisplayBalance(c1);
		c1.Withdraw(1231);
		DisplayBalance(c1);
	}

}
