import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("digite um numero inteiro: ");
		n = ler.nextInt();
		System.out.println("o antecessor de "+n+" é: "+(n-1));
		System.out.println("o sucessor de "+n+ " é: "+(n+1));
	}

}
