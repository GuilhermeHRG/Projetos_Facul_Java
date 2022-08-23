import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b;
		System.out.println("digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("digite o valor de B: ");
		b = ler.nextInt();
		if (a>b){
			System.out.println("A é maior que B");}
		else if (a<b){
			System.out.println("B é maior que A");
		}
		else if(a==b){
			System.out.println("A é igual a B");
		}
		ler.close();
	}
		
			
}
