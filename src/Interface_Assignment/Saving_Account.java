package Interface_Assignment;

public class Saving_Account extends Account implements Entry{

	double amount;
	
	Saving_Account(double balance)
	{
		System.out.println("Saving account");
		//this.balance=balance;
		super.balance=balance;
		System.out.println(balance);
	}
	public void WithdrawAmount(double amount) {
		this.amount=amount;
		System.out.println("The withdrawal amount:"+amount);
		System.out.println("The balance after withdrawal:-"+(balance-amount));
	}

	public void Make_Payment(double amount) {
		System.out.println("The payment is made:"+amount);
	}

}