package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Type how many students will rent a room: ");
		int x = sc.nextInt();
		
		Hotel[] vect = new Hotel[10];
		
		for (int i = 0; i<x; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();
			vect[room] = new Hotel(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
			}
			
		}
		
				
		sc.close();
	}

}
