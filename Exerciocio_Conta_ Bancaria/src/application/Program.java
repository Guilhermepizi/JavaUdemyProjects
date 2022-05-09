package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		int opcao;
		Scanner sc = new Scanner(System.in);
		Account acc = new Account(null, "0", '0' , 0);

		do {
			opcao = -1;
			Account.menu();
			opcao = sc.nextInt();
			if (opcao == 0) {
				System.out.print("\nAté logo!");
				sc.close();
			}

			switch (opcao) {

			case 1:
				acc.createAccount();
				System.out.println("\nAccount data: " + acc);
				break;

			case 2:
				acc.changeHolder();
				System.out.println("\nAccount data: " + acc);
				break;

			case 3:
				acc.deposit();
				System.out.println("\nAccount data: " + acc);
				break;

			case 4:
				acc.withdraw();
				System.out.println("\nAccount data: " + acc);
				break;

			default:
				System.out.println("Opção inválida.");

			}
		} while (opcao != 0);

	}
}
