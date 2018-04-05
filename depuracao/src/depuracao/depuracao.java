package depuracao;
import java.util.Scanner;

public class depuracao {
	public static void main (String[]args){
		//depuracao e monitorar o programa a cada monento
		//e entender o motivo de cada açao//
		Scanner in = new Scanner (System.in);
		double nota1, nota2, nota3, nota4; 
		
		System.out.println("digite sua nota");
		nota1 = in.nextDouble();
		
		System.out.println("digite sua 2 nota");
		nota2 = in.nextDouble();
		
		System.out.println("digite sua 3 nota");
		nota3 = in.nextDouble();
		
		System.out.println("digite sua 4  nota");
		nota4 = in.nextDouble();
		
		double soma = nota1+nota2+nota3+nota4;
		soma = soma / 4;
		
		
		if (soma >= 7){
			System.out.println("Voce passou de Ano !!!!"+soma);
		}
		
		else {
			System.out.println("Voce reprovou de ano de Ano!!!!"+soma);
			
		}
		
		
	}
}
