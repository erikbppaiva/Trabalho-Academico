package Entities;

public class Diretor extends Funcionario {

	double media;
	double soma;
	
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
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

		return "";

		// "Diretor: " + "Nome: " + getNome() + " CPF: " + getCpf() +
		// " Matricula: " + getMatricula() + " Salario: " + getSalario()
		// + " Imposto: " + getImpostoDeRenda();
	}

}
