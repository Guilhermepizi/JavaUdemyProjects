import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Digite um n�mero:");
		x = sc.nextInt();
		
		System.out.println("Digite outro n�mero:");
		y = sc.nextInt();
		
		if(x < y) {
			if(y%x == 0) {
			System.out.println("N�meros m�ltiplos");
		}
			else {
				System.out.println("N�o m�ltiplos");	
			}
		}
		else {
			if(x%y == 0) {
				System.out.println("N�meros m�ltiplos");
			}
				else {
					System.out.println("N�o m�ltiplos");	
				}
			}
		sc.close();
	}

}
