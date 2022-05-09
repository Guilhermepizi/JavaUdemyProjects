import java.util.Scanner;

public class ex05 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero a ser fatorado:");
		
		int n = sc.nextInt();
		int fat = 1;
			
		

		for (int i=1; i<=n; i++) {
				fat = fat * i;
		}			
			
		System.out.println(fat);
			
		
		}
}
