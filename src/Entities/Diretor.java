package Entities;

import Leitor.Leitor;

public class Diretor extends Funcionario {

	public void addDir() {
		setNome(Leitor.lerString("Nome: "));
		setCpf(Leitor.lerString("CPF: "));
		setSalario(Leitor.lerDouble("Salário: "));
	}

	public Diretor(int matricula) {
		super(matricula);
	}

	@Override
	public double getImpostoDeRenda() {
		return getSalario() * 0.23;
	}

	@Override
	public String toString() {

		return 

		 "Diretor: " + "\tNome: "+getNome()+"\t CPF: "+getCpf()+
			"\tSalario: " + getSalario() +"\tImposto: " +getImpostoDeRenda();
		}

}
