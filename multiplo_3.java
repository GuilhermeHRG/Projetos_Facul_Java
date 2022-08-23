import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		System.out.println("digite o valor de n: ");
		n = ler.nextInt();
		if(n%3==0){
			System.out.println("é múltiplo de 3");
		}
		else{
			System.out.println("não é múltiplo de 3");
		}
		ler.close();
	}

}
