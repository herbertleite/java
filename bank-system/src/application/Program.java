package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if (response=='y') {
			System.out.print("Enter initial deposit value:  ");
			Double initalDeposit= sc.nextDouble();
			account = new Account(number,holder,initalDeposit);
		}
		else {
			account = new Account(number,holder);
		}
		System.out.println();
		System.out.println("Account Data: "+ account);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a deposit Value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.print("Update accout data: "+account);
		
		System.out.println();
		System.out.print("Enter a withdraw Value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.print("Update accout data: "+account);
		sc.close();
		
		
	}

}
