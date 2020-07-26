package Interface_Assignment;

public class Account {
	
	double balance=1000;
	
	public static void main(String[] args) {
	
	Current_Account ca=new Current_Account(10000);
	ca.WithdrawAmount(1000);
	ca.Make_Payment(500);
	
	Saving_Account sa=new Saving_Account(10000);
	sa.WithdrawAmount(1000);
	sa.Make_Payment(500);
}
}





