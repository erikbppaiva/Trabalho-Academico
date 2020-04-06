package Main;

import java.util.ArrayList;

import Entities.Diretor;
import Entities.Professor;
import Leitor.Leitor;

public class Main {

	public static void main(String[] args) {
		ArrayList<Professor> professor = new ArrayList<Professor>();
		ArrayList<Diretor> diretor = new ArrayList<Diretor>();
		char opcao = 'n';
		char op;
		double somaProf = 0;
		int ip = 0;
		int id = 0;
		double mediaProf = 0;
		double mediaDir=0;
		double somaDir=0;
		double somaTot = 0;
		double mediaTot = 0;
		
		
		do {
			op = Leitor.lerCaractere("Cadastrar Diretor ou Professor: ");
			if (op == 'p') {

				Professor prof = new Professor(Leitor.lerInt("Digite a Matricula: "));
				prof.setNome(Leitor.lerString("Nome: "));
				prof.setCpf(Leitor.lerString("CPF: "));
				prof.setSalario(Leitor.lerDouble("Salário: "));
				professor.add(prof);
				ip++;

				somaProf += prof.getImpostoDeRenda();
				mediaProf = somaProf / ip;

			} else if (op == 'd') {

				Diretor dir = new Diretor(Leitor.lerInt("Digite a Matricula: "));
				dir.setNome(Leitor.lerString("Nome: "));
				dir.setCpf(Leitor.lerString("CPF: "));
				dir.setSalario(Leitor.lerDouble("Salário: "));
				diretor.add(dir);
				id++;
				somaDir += dir.getImpostoDeRenda();
				mediaProf = somaDir/id;

			}

			opcao = Leitor.lerCaractere("Deseja continuar? ");

		} while (opcao == 's');

		somaTot += somaProf;
		mediaTot += mediaProf;
		
		
		
		if (op == 'd') {
			for (Diretor d : diretor) {
				System.out.println(d);

			}
		} else if (op == 'p') {

			for (Professor p : professor) {
				System.out.println(p);
			}
		}
		System.out.println(ip);
		System.err.println(id);
		System.out.println("A média dos impostos dos funcionarios: "+ mediaTot);
		System.out.println("A soma dos impostos dos Funcionarios: " + somaTot);


	}
}
