package familia58aulajava01;



// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.


import java.util.Scanner;


public class lacoDecisaoExercicio1java {


		public static void main(String[] args) {
			
				int n1, n2, n3, maior;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("\nDigite o primeiro n�mero: ");
				n1 = leia.nextInt();
				System.out.println("\nDigite o segundo n�mero: ");
				n2 = leia.nextInt();
				System.out.println("\nDigite o terceiro n�mero: ");
				n3 = leia.nextInt();
				
				if(n1 >= n2) {
					maior = n1;
				}else {
					maior = n2;
				}
				
				if(maior <= n3) {
					maior = n3;
				}
				
				
				System.out.println("\nO maior n�mero �: "+maior);
		}

	}
