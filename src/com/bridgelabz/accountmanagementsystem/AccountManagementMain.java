package com.bridgelabz.accountmanagementsystem;

public class AccountManagementMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Account Management System!!");
		
		AccountManagement accountmanagement = new AccountManagement();
		accountmanagement.addAccount();
		accountmanagement.displayAccountDetails();

	}

}
