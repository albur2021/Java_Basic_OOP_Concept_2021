package BankAccount;

import java.util.Random;
//Class Structure: 
	//1. Creating Instances/Properties/Fields/Variables 
	//2. Creating Constructor based on those fields/instances (make sure it has the same name as the class does) 
	//3. Setters and Getters (to pull/use Class's fields if they were Declared as 'private' (no straight accessibility to the Class's fields)
	//4. Methods to Operate w/Fields
	
	
	//Java DataType Approach to variables, methods, classes and so on:
	// accessibility, data type return, name





//1 creating instances 
public class BankAccount {
	private String accountNumber;
	private int checkingBalance;
	private int savingBalance;
	// creating Static  instances assigned w/ 0, make sure they are public, which means no Setters and Getters to them 
	public static int totalCarsCreated=0;
	public static int accountsCreated=0;
	public static int totalAmountOfFunds=0;
	
	//2 Constructor - the same Class Name on it
	public BankAccount( int checkingBalanceInput, int savingBalanceInput) {
		this.checkingBalance = checkingBalanceInput;
		this.savingBalance = savingBalanceInput;
		this.accountNumber=this.generateRandomAccountNum();//have this static instance generate a random number by assigning method to it
		// have  this static public instance count all other objects created out of this Class 
		accountsCreated++;
		
		totalAmountOfFunds+=this.getCheckingBalance();//get all money generated from Class's Objects. Why here? Because, the Constructor's Goal is to make 
		// all Variables/Instances Alive or Instantiating Them. Otherwise, without Constructor  all those Variables are dead and can't be manipulated by object created out of this class
		// Object is the Blue Print of this Class, gets all instances and methods out of this Class to work further
		
		
	}
	// Creating a Random Number Method
	public String generateRandomAccountNum() {
		
		Random rand = new Random();
		String result="";
		for(int i=0;i<10;i++) {// Generate 10 digits length number
			int rand_int = rand.nextInt(10);
			result+=rand_int;
			
		}
		System.out.println("Random Account Number: " + result);
		
		return result;
		
	}
	// Creating deposit method 
	
	public int depositIntoDebitAccount(int deposit) {
		this.checkingBalance +=deposit;
		totalAmountOfFunds +=this.checkingBalance;
		return totalAmountOfFunds;
		
	}
	
	// Creating withdraw method
	public int withdrowFromDebitAccount(int withdraw) {
		if(this.getCheckingBalance() < withdraw) {
			System.out.println("Sorry your account is not sufficient");
			return this.getCheckingBalance();
		
		
		}else {
		   this.checkingBalance -= withdraw;;
		   
			totalAmountOfFunds -=this.checkingBalance;
			return this.checkingBalance;
			
			
			
			
			
		}
	}
	
	
	/////////////////////// Getters and Setters ////////////////////////////////////////
	public int getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public int getSavingBalance() {
		return savingBalance;
	}


	public void setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
