package constante;
import java.util.Scanner;
public class constante {
	public static void main (String[]args){
		
		// constante e a loca�ao de um espa�o na memoria
		//para guardar um  valor
		//os dados nunca serao alterados
		//tem seu endere�o protegido
		//declaramos uma vez, utilizaremos qts vezes precizar
		
		final double vsom = 340.28;
		System.out.println("Digite o espa�o de tempo");
		Scanner in = new Scanner(System.in);
		int tempo = in.nextInt();
		System.out.println("A distencia e de " + tempo * vsom+  "  metros percorridos");
		System.out.println("A distencia em km " + (tempo * vsom)/ 1000 +  "  km  percorridos");
		
		
	}
}
