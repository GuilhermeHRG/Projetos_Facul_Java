import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float sal, parc, sm;
		System.out.println("digite seu salario: ");
		sal = ler.nextFloat();
		System.out.println("digite o valor da prestação: ");
		parc = ler.nextFloat();
		sm = (sal/100)*30;
		if (parc<=sm) {
			System.out.println("empréstimo autorizado!!");
		}
		else {
			System.out.println("empréstimo negado!!");
		}
		ler.close();
	}

}
