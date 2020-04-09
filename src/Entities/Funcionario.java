package Entities;

import java.util.Calendar;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private int matricula;
	private Calendar anoAdmissao;
	private double media;

	public double getMedia() {
		return media;
		
	}
	public double getMedia(double media) {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario(int matricula) {
		super();
		this.matricula = matricula;
	}

	public double getImpostoDeRenda() {
		return 0;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Calendar getAnoAdmissao() {
		return anoAdmissao;
	}
	public void setAnoAdmissao(Calendar anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override //sobrescrita vindo do Object
	public boolean equals(Object obj) {
		if (obj instanceof Professor) {// é um Professor?
			Professor temp = (Professor) obj;
			if (getMatricula()==temp.getMatricula()) {
				return true;
			}else {
				return false;
			}
				
		}
		return super.equals(obj);
	}
	
}
