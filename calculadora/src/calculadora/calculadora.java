package calculadora;
import java.util.Scanner;

public class calculadora {
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		
		double num1,num2,soma,subtracao,multi,divi;
		System.out.println("insira um numero");
		num1 = in.nextDouble();
		//como se fosse scanf em C armazena informaçao//
		System.out.println("insira outro numero");
		num2 = in.nextDouble();
		soma = num1+num2;
		System.out.println("o resultado da soma e " +soma);
		// imprime o resultado e mosta a variavel final//
		subtracao = num1-num2;
		System.out.println("o resultado da subtracao e "+ subtracao);
		
		multi = num1*num2;
		divi = num1/num2;
		System.out.println("o resultado da multiplicaçao e " + multi);
		System.out.println("0 resultado da divisao e " + divi);
		
	}

}
