package model;

import java.util.Scanner;

import entities.Aluguel;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * double[] aluguel = new double [10]
		 */
		
		Aluguel[] vetor = new Aluguel[10];
		
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Aluguel #"+i+": ");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);		
					
		}
		System.out.print("quantos ocupados: ");
		for (int i = 0; i<10; i++);
		if(vetor[n] != null) {
			System.out.println(n+": "+vetor[n]);
		}
		
		
		
		
	}

}
