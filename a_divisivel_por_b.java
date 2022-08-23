import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b;
		System.out.println("digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("digite o valor de B: ");
		b = ler.nextInt();
		if (a%b==0){
			System.out.println("A é divisivel por B.");
		}
		else{
			System.out.println("A não é divisivel por B");
		}
		ler.close();
	}

}
