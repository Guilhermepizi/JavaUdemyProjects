package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.print("Name: ");
		std.name = sc.nextLine();
		
		System.out.print("\nNota 1 Trimestre: ");
		std.grade1 = sc.nextDouble();
		
		System.out.print("\nNota 2 Trimestre: ");
		std.grade2 = sc.nextDouble();
		
		System.out.print("\nNota 3 Trimestre: ");
		std.grade3 = sc.nextDouble();
		
		std.pass();
		
		sc.close();	
}
}
