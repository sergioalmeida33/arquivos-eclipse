package entradaesaida;

import java.util.Scanner;

public class entradaesaida {
	public static void main(String[]args){
		
		System.out.println("Informe a idade do seu dog");
		Scanner in = new Scanner (System.in);
		
		int idadedog = in.nextInt ();
		
		 idadedog = idadedog * 7 ;
		 
		 System.out.println("o seu dog tem " +idadedog+"anos");
		
		
		
	}

}
