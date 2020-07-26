package Interface_Assignment;

public class Current_Account extends Account implements Entry{

	double Extra_charges, amount;
	
	Current_Account(double balance)
	{
		System.out.println("Current account");
		this.balance=balance;
	}
	public void WithdrawAmount(double amount) {
		this.amount=amount;
		this.Extra_charges=amount*10/100;
		this.balance=balance-(amount+Extra_charges);
		System.out.println("The withdrawal amount:"+amount);
		System.out.println("The balance after withdrawal:-"+balance);
	}
	public void Make_Payment(double amount) {
		System.out.println("The payment is made:"+amount);

	}
}

