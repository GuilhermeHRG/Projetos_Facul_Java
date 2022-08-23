import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, r;
		System.out.println("digite o valor de N1: ");
		n1 = ler.nextInt();
		System.out.println("digite o valor de N2: ");
		n2 = ler.nextInt();
		r=n1+n2;
		if (r>20){
			System.out.println("N1+N2 é maior que 20 portanto vou lhe apresentar a soma deles +8:  "+(n1+" + ")+(n2)+(" + 8= "+(r+8)));
		}
		else{
			System.out.println("N1+N2 não supera 20, portanto, vou mostrar a soma deles subtraindo 5: "+(n1+" + ")+(n2)+(" - 5= "+(r-5)));
			ler.close();
		}
		

	}

}
