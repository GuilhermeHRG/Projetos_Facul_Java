package aula01_ex03;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int id, ms, dia, con1, con2, sm;
		System.out.println("Digite sua idade: ");
		id = ler.nextInt();
		System.out.println("Digite o mês em que nasceu: ");
		ms = ler.nextInt();
		System.out.println("digite o dia em que nasceu: ");
		dia = ler.nextInt();
		con1 = id*365;
		con2 = ms*30;
		sm = con1+con2+dia;
		
		System.out.println(id+" anos,"+ms+" meses e "+dia+" dias.= "+sm+" dias");
		

	}

}
