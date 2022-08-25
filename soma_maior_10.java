import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, sm;
		System.out.println("digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("digite o valor de b: ");
		b= ler.nextInt();
		sm=a+b;
		if (sm>10) {
			System.out.println("o resultado é: "+sm);}
		else {
			System.out.println("a soma de a e b não supera 10.");
		}
			ler.close();
	}

}
