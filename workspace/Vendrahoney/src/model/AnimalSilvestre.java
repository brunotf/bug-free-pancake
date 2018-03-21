package model;

import java.util.HashSet;

public class AnimalSilvestre extends Animal {

	private String marcacaoIndividual;
	private String numeroIbama;
	
	public AnimalSilvestre(String nome, String dataNasc, int sexo, 
			String peso, String porte, HashSet<Consulta> consulta,
			Cliente cpf, String marcacaoIndividual,	String numeroIbama) {
		
		super(nome, dataNasc, sexo, peso, porte, consulta, cpf);
		this.marcacaoIndividual = marcacaoIndividual;
		this.numeroIbama = numeroIbama;
	}

	public String getMarcacaoIndividual() {
		return marcacaoIndividual;
	}

	public void setMarcacaoIndividual(String marcacaoIndividual) {
		this.marcacaoIndividual = marcacaoIndividual;
	}

	public String getNumeroIbama() {
		return numeroIbama;
	}

	public void setNumeroIbama(String numeroIbama) {
		this.numeroIbama = numeroIbama;
	}

}
