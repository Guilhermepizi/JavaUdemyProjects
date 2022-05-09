package entities;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	private static BigInteger account;
	public static String holder;
	private static char initialdep;
	private static double balance;
	
	public static void menu() {
	System.out.println("\nSelect an Option:\n");
	System.out.println("1 - Create Account: ");
	System.out.println("2 - Change holder's name: ");
	System.out.println("3 - Make a deposit: ");
	System.out.println("4 - Make a withdraw: ");
	System.out.println("0 - Exit");
	
	}
	public Account(BigInteger account, String holder, char initialdep, double balance) {
		Account.account = account;
		Account.holder = holder;
		Account.initialdep = initialdep;
		Account.balance = balance;
	}
	
	public void createAccount() throws IOException {
		
		System.out.printf("Enter Account number: ");
		account = sc.nextBigInteger();
		
		sc.nextLine();

		System.out.print("\nEnter account holder: ");
		holder = sc.nextLine();


		System.out.println("Is there a initial deposit (y/n)?");
		initialdep = (char)System.in.read();
		
		if ((initialdep == 'Y') || (initialdep == 'y') || (initialdep == 'n') || (initialdep == 'N')) {
			
			if((initialdep == 'Y') || (initialdep == 'y')) {
			System.out.println("Value of initial deposit: ");
			balance = sc.nextDouble();
			}
			else if ((initialdep == 'n') || (initialdep == 'N')) {
			balance = 0;
			
		} 
		}	else 
			System.out.println("Type Y or N to procede ");
	}
		

	 
	public void changeHolder() {
		sc.nextLine();
		System.out.println("Write the new name: ");
		holder = sc.nextLine();
		
	}

	public void deposit() {
		System.out.println("Type the value of the deposit: ");
		double deposit = sc.nextDouble();
		Account.balance += deposit;
	}

	public void withdraw() {
		System.out.println("Type the value of the withdraw: ");
		double withdraw = sc.nextDouble();
		Account.balance -= withdraw +5;
	}

	public String toString() {
		return "Account:" + account + ", Holder: " + holder + " Balance: $ " + String.format("%.2f", balance);
	}
		 
}
