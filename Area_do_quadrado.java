import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int b, h, a;
		System.out.println("Digite a base: ");
		b = leia.nextInt();
		System.out.println("Digite a altura: ");
		h = leia.nextInt();
		a = b * h;
		System.out.println("area = "+a);
		leia.close();

	}

}
