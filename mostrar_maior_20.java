import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("digite um numero: ");
		System.out.println("só vou mostrar na tela se for maior que 20.");
		n = ler.nextInt();
		if (n>20) {
			System.out.println(n+" é maior que 20");}
		else
		{
			System.out.println("não é maior que 20, então não mostro.");
		}
	}

}
