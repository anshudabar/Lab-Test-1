package com.accountapp;

public class Accountapp {

	public static void main(String[] args) {
		
		Date date1= new Date(02,10,2004);
		Date date2= new Date(02,11,1999);
		
		Owner ankita = new Owner("Ankita Gupta",date1,"WQS456");
		Owner sweta = new Owner("Sweta Tripathy ",date2,"STY456");
		
		
		Account account1 = new SavingAccount(ankita,1000,"1234");
		Account account2 = new CurrentAccount(sweta,10000,"5678");
		
		System.out.println(account1.getBalance());
		account1.deposit(500);
		System.out.println(account1.getBalance());
		
		
		System.out.println(account1.getBalance());
		account1.withdraw(500);
		System.out.println(account1.getBalance());
		account1.withdraw(1200);
	}
}