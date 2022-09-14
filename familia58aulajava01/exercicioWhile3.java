package familia58aulajava01;



//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

import java.util.Scanner;

public class exercicioWhile3 {


			public static void main(String[] args) {
			
			int idade, menor21=0, maior50=0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
			while(idade!=-99) {
				if(idade<=21) {
					menor21++;
				}else if (idade>=50) {
					maior50++;
				}
				System.out.println("\nDigite a idade: ");
				idade = sc.nextInt();
			}
			
			System.out.println("\nTotal de pessoas com menos de 21 anos: "+menor21+" pessoas.");
			System.out.println("\nTotal de pessoas com mais de 50 anos: "+maior50+" pessoas.");
			
			
		}

	}