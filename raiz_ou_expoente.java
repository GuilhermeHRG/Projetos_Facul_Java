import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("digite o valor de n: ");
		n = ler.nextInt();
		if (n>=0){
			System.out.println("a raiz quadrada de "+n+" é "+Math.sqrt(n));
		}
		else if(n<0){
			System.out.println(n+" ao quadrado é: "+Math.pow(n, 2));
		}
    ler.close();

	}

}
