import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Digite um número:");
		x = sc.nextInt();
		
		System.out.println("Digite outro número:");
		y = sc.nextInt();
		
		if(x < y) {
			if(y%x == 0) {
			System.out.println("Números múltiplos");
		}
			else {
				System.out.println("Não múltiplos");	
			}
		}
		else {
			if(x%y == 0) {
				System.out.println("Números múltiplos");
			}
				else {
					System.out.println("Não múltiplos");	
				}
			}
		sc.close();
	}

}
