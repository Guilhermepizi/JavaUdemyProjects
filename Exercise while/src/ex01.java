import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		while(x != 2002) {
			System.out.println("Digite a Senha:");
			x = sc.nextInt();
			
			if(x!=2002) {
			System.out.println("Senha Invalida\n");
			}
			
			else {
				System.out.println("Acesso Permitido");
			}
		}
		
	}
	
}
