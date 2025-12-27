package com.constructorandacessmodifers.level1;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(101,"Saud Ansari",5000);
        s.displayDetails();
        s.setBalance(7000); 
        System.out.println("Updated Balance: " + s.getBalance());

	}

}
