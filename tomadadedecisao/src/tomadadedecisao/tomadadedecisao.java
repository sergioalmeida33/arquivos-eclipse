package tomadadedecisao;
import java.util.Scanner; 

public class tomadadedecisao {
	public static void main (String[]args){
		
		int num;
		num = 10;
		System.out.println("ola digite um numero");
		Scanner in = new Scanner (System.in);
		// funçao Scanner e ver o que usuario digitou//
		num = in.nextInt();
		// declarar varialvel in para escrever na tela//
		if(num == 10){
			System.out.println("sim e igual ");
		}
		// abri e fechar aspas pare ler o que esta dentro//
			 else{
			System.out.println("nao o numero nao e : ");	
			}
			
		}
	}

