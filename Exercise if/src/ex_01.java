import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um n�mero:");
		x = sc.nextInt();
		
		if(x>0) {
			System.out.println("N�mero positivo");
		}
		else {
			System.out.println("N�mero negativo");
		}
		sc.close();
	}

}
