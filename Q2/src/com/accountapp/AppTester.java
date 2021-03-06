package com.accountapp;

public class AppTester {

	public static void main(String[] args) {
		
		//Creating Date objects
		Date Date1= new Date(07,07,1991);
		Date Date2= new Date(01,12,1985);
		
		//Creating Owner objects
		Owner Mark = new Owner("Mark Zuckerbur",Date1,"MZ91");
		Owner Bill = new Owner("BillGates ",Date2,"BG85");
		

		//Creating Accounts
		Account account1 = new SavingAccount(Mark,5000,"77910");
		Account account2 = new CurrentAccount(Bill,6000,"11285");
		
		//Depositing
		System.out.println(account1.getBalance());
		account1.deposit(1000);
		System.out.println(account1.getBalance());
		
		//Withdrawing
		System.out.println(account1.getBalance());
		account1.withdraw(1000);
		System.out.println(account1.getBalance());
		account1.withdraw(2000);
	}
}
