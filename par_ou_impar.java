import java.util.Scanner;

public class Main {
	/*receber inteiro do usuario um int e mostra se é par ou impar*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n;
		System.out.println("Digite o numero: ");
		n = leia.nextInt();
		if (n%2==0) {
		System.out.println("par");}
		else {
		System.out.println("ímpar");}
		}
	}
