package JavaAula1;

import java.util.Scanner;

public class JavaAula1 {
	public static void main(String[] args) {
Scanner leitura = new Scanner (System.in);
		
		
		int i = 2;
		System.out.println("Insira um valor: ");
		i = leitura.nextInt();
				
		switch(i) {
		case 0:
			System.out.println("i é igual a 0");
			break;
			
		case 1:
			System.out.println("i é igual a 1");
			break;
			
		case 2:
			System.out.println("i é igual a 2");
			break;
			
		default:
			System.out.println("valor invalido");
			break;
		}					
		
		
		
		
		/*int i = 0;
		while(i <= 10) {
			System.out.println(i); ++i;
		}*/
		
		
		
		/*for (int i=0; i < 10; i++) {
			System.out.println(i);
		}*/
		
		
		
		/*if(2>1) {
			System.out.println("dois é maior que 1");
		}
		else {
			System.out.println("algo esta errado");
		}*/
	}

}



