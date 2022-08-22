import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		System.out.println("digite o valor de n: ");
		n = ler.nextInt();
		if (n>=0){
			System.out.println(n+" é postivo.");}
		else{
			System.out.println(n+" é negativo.");
			ler.close();
		}

	}

}
