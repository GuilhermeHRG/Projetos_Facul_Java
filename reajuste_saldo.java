import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float sal, rea, sm;
		System.out.println("digite seu saldo: ");
		sal = ler.nextFloat();
		rea= (sal*1)/100;
		sm = sal+rea;
		System.out.println("saldo: "+sal);
		System.out.println("saldo reajustado em 1%: "+sm);
		ler.close();

	}

}
