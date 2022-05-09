import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		int impar = 0;
		
		System.out.println("Digite um numero de 0 a 1000:");
		
		int x  = sc.nextInt();
		
		if(1<=x && x<=1000) {
			for (i=0;i<=x; i++) {
				impar = i%2;
				
				if(impar != 0) {
					System.out.println(i);
				}
			}
		}
	}

}
