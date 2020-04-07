package Entities;

import Leitor.Leitor;

public class Professor extends Funcionario{
	
	
	public Professor(int matricula) {
		super(matricula);
	}
	
	public void addProf(){
		setNome(Leitor.lerString("Nome: "));
		setCpf(Leitor.lerString("CPF: "));
		setSalario(Leitor.lerDouble("Salário: "));
	
	}

	
	@Override
	public double getImpostoDeRenda() {
		return getSalario() * 0.20;
	}
	
	@Override
	public String toString() {
		return "PROFESSOR: "+ "\tNome: "+getNome()+"\t CPF: "+getCpf()+
				"\tSalario: " + getSalario() +"\tImposto: " +getImpostoDeRenda();
	}

	
	
	

}
