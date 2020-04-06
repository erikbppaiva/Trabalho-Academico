package Entities;

public class Professor extends Funcionario{
	
	
	public Professor(int matricula) {
		super(matricula);
	}
	
	@Override
	public double getImpostoDeRenda() {
		return getSalario() * 0.20;
	}
	
	@Override
	public String toString() {
		return "PROFESSOR: "+ 
				"Salario: " + getSalario() +" Imposto: " +getImpostoDeRenda();
	}

	
	
	

}
