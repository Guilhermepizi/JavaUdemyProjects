import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um n�mero:");
		x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("N�mero par");
		}
		
		else {
			System.out.println("N�mero �mpar");
		}

	}

}
