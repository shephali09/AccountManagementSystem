package com.bridgelabz.accountmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement implements AddAccount, DisplayAccountDetails {

	List<Account> accounts = new ArrayList<Account>();
	Scanner scanner = new Scanner(System.in);
	Account account = new Account();

	public void addAccount() {

		System.out.println("Enter Account Number: ");
		int accountNumber = scanner.nextInt();
		account.setAccountNumber(accountNumber);

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = scanner.next();
		account.setAccountHolderName(accountHolderName);

		System.out.println("Enter Account Holder Dob: ");
		String accountHolderDob = scanner.next();
		account.setAccountHolderDob(accountHolderDob);

		System.out.println("Enter Account HolderMobile Number: ");
		long accountHolderMobileNumber = scanner.nextLong();
		account.setAccountHolderMobileNumber(accountHolderMobileNumber);

		System.out.println("Enter Account Holder Email: ");
		String accountHolderEmail = scanner.next();
		account.setAccountHolderEmail(accountHolderEmail);

		accounts.add(account);
		System.out.println("Account added successfully!");

	}

	public void displayAccountDetails() {

		if (accounts.isEmpty()) {
			System.out.println("Any Account is not created yet");
		}

		System.out.println("Account Details");
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(account.getAccountNumber());
			System.out.println(account.getAccountHolderName());
			System.out.println(account.getAccountHolderDob());
			System.out.println(account.getAccountHolderMobileNumber());
			System.out.println(account.getAccountHolderEmail());

		}

	}

}
