package familia58aulajava01;

import java.util.Scanner;

public class exercicioJavaFor2 {

	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.


		public static void main(String[] args) {
			
			int par=0, impar=0, num, x;
			
			Scanner sc = new Scanner(System.in);

			
			for(x=1;x<=10;x++) {
				System.out.println("Insira um n�mero: ");
				num = sc.nextInt();
				if (num % 2 == 0) {
					par++;
				}else {
					impar++;
				}
				
			} 
			System.out.println("\nN�s temos: "+par+" n�meros pares");
			System.out.println("\nN�s temos: "+impar+" n�meros impares");
			
		}

	}