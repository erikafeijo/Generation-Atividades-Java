package familia58aulajava01;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	//0(zero).


import java.util.Scanner;

public class exercicioWhile6 {


		public static void main(String[] args) {
			
			int numeros,contMult3=0,somaMult3=0;
			float media;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com um n�mero: ");
			numeros = leia.nextInt();//0
			
			do {
				
				if(numeros == 0) {
					System.out.println("\nSair do loop!!!");
				}else {
					
					if(numeros % 3 == 0) {
						somaMult3 += numeros;
						contMult3++;
					}
					System.out.println("\nEntre com um n�mero: ");
					numeros = leia.nextInt();
				}
				
			}while(numeros != 0);
			
			if(contMult3 == 0) {
				System.out.println("\nN�o podemos dividir por ZERO!!!");
			}else {
				
				media = somaMult3 / contMult3;
				System.out.printf("\nM�dia dos n�meros m�ltiplos de 3: %.1f",media);
			}
			

		}

	}