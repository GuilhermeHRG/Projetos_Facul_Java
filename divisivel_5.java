import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		System.out.println("digite o valor de n: ");
		n = ler.nextInt();
		if(n%5==0){
			System.out.println("é divisivel de 5");
		}
		else{
			System.out.println("não é divisivel de 5");
		}
		ler.close();
	}

}
