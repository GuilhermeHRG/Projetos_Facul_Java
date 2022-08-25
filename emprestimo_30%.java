import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int sal, parc, sm;
		System.out.println("digite seu salario: ");
		sal = ler.nextInt();
		System.out.println("digite o valor da prestação: ");
		parc = ler.nextInt();
		sm = (sal/100)*30;
		if (parc<=sm) {
			System.out.println("empréstimo autorizado!!");
		}
		else {
			System.out.println("empréstimo negado!!");
		}
	}

}
