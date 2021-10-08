package BankAccount;

public class AccountBankTest {

	public static void main(String[] args) {
		
		BankAccount object = new BankAccount(20,20);
		System.out.println(object.getAccountNumber());
		System.out.println(object.depositIntoDebitAccount(2));
		System.out.println(object.getCheckingBalance());
	    System.out.println(object.withdrowFromDebitAccount(4));
	    System.out.println(object.getCheckingBalance());
	    System.out.println(BankAccount.accountsCreated);
	    System.out.println(BankAccount.totalAmountOfFunds);

	}

}
