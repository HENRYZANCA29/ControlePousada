package entities;

public class Aluguel {

	/*
	 * aluguel de 10 quartos;um programa que inicie
	 * os 10 quartos vazios, e depois leia uma N que pode ser de 1 a 10 registre o aluguel, nome e email.
	 *  dos hospedes e o quarto q ele escolheu. ao final mostre um relatorio com todas as ocupações
	 * 
	 */
	
	private String nome;
	private String email;
	
	//get = pegue
	//set = passa
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	
	
	
	
	
	public String getNome( ) {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public String getEmail() {
		return email;
	}
	
	
	public String toString() {
		return nome=", "+email;
	}
	
	
	
	
	
}
