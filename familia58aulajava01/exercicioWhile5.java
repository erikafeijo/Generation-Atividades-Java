package familia58aulajava01;

import java.util.Scanner;



//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)



public class exercicioWhile5 {

	
		public static void main(String[] args) {
			
			int num, soma=0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um n�mero: ");
			num = sc.nextInt();
			
			do {
				if(num == 0) {
					System.out.println("\nSair do loop...");
				}else {
					if(num > 0) {
						soma += num;
						num++;
					}
					System.out.println("\nDigite outro n�mero: ");
					num = sc.nextInt();
				}
				
			}while (num != 0);
			
			System.out.println("A soma dos n�meros digitados �: "+soma);
		}

	}