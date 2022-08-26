import java.util.Scanner;

public class EXEXEXE {

	public static void main(String[] args) {
		
	
				Scanner ler = new Scanner(System.in);
				double vl1, vl2, ipi, tot;
				int qtd1, qtd2, pdt1, pdt2;
				System.out.println("COD 01 VIRABREQUIM = 1500,00   // COD 02  PISTÃO 2 POLEGADAS 50,00");
				System.out.println("digite o código do produto: ");
				pdt1 = ler.nextInt();
				System.out.println("digite a quantidade de unidades: ");
				qtd1 = ler.nextInt();
				System.out.println("digite o código do produto: ");
				pdt2 = ler.nextInt();
				System.out.println("digite a quantidade de unidades: ");
				qtd2= ler.nextInt();
				System.out.println("digite o ipi: ");
				ipi = ler.nextFloat();
				vl1= 1500;
				vl2= 50;
				tot=((vl1*qtd1 + vl2*qtd2)*(ipi/100 + 1));
				System.out.println("total: R$" +tot);
	}

}
