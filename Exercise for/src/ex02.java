import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de numeros: ");
		
		int n  = sc.nextInt();
		int j=0;
		int k=0;
		int i;
		
		System.out.println("Digite os numeros:");
		
		for(i=0; i<n; i++) {
			
			int x  = sc.nextInt();
			
			if(x>=10 && x<=20) {
				k++;
			}
			else {
				j++;
			}
					
		}
		System.out.println(k + "in");
		System.out.println( j + "out");

	}

}
