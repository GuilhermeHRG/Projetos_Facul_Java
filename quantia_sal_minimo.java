import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int salm, sal, sm;
		System.out.println("salário minimo: ");
		salm = ler.nextInt();
		System.out.println("digite seu salário: ");
		sal = ler.nextInt();
		sm=sal/salm;
		System.out.println("vc ganha "+sm+" salários mínimos");
	}

}
