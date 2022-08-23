import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b;
		System.out.println("digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("digite o valor de B: ");
		b = ler.nextInt();
		if (a%3==0 && b%7==0){
			System.out.println("A é divisivel por e 3 e B por 7");
		}
		
		else if(a%7==0 && b%3==0){
			System.out.println("A é divisivel por 7 e B por 3");
		}
		else if (a%3!=0 && b%7!=0){
			System.out.println("ambos não são divisiveis por 3 e por 7");
		}

	}
}
