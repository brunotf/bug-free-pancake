package model;

import enumaration.TipoEspecialidade;

public class Especialista extends Veterinario {
	
	public Especialista(String crmv, String nome, String dataNasc, String cpf, String telefone,
			int diasDisponiveis, int diasTrabalhados, double valorHora, double salario) {
		
		super(crmv, nome, dataNasc, cpf, telefone, diasDisponiveis,	diasTrabalhados, valorHora, salario);
	}

	private TipoEspecialidade especialidade;
	
	@SuppressWarnings("unused")
	private String sociedadeEspecialista;

	public TipoEspecialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(TipoEspecialidade especialidade) {
		this.especialidade = especialidade;
	}

	public void setSociedadeEspecialista(String sociedadeEspecialista) {
		this.sociedadeEspecialista = sociedadeEspecialista;
	}
	
	@Override
	public double gerarSalario(double bonus) {
		return (diasTrabalhados * valorHora) + bonus ;
	}
	
	public void horaExtra() {
		System.out.println("Horas guardadas no banco de horas.");
	}
}
