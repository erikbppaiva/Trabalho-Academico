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
		int i = 0;
		int j = 0;
		double mediaProf = 0;
		double somaDir = 0;
		do {
			op = Leitor.lerCaractere("Cadastrar Diretor ou Professor: ");
			if (op == 'p') {

				Professor prof = new Professor(Leitor.lerInt("Digite a Matricula: "));
				prof.addProf();
				i++;
				somaProf += prof.getImpostoDeRenda();
				mediaProf = somaProf / i;
				professor.add(prof);

			} else if (op == 'd') {

				Diretor dir = new Diretor(Leitor.lerInt("Digite a Matricula: "));
				dir.addDir();
				diretor.add(dir);
				j++;
				somaDir += dir.getImpostoDeRenda();
				mediaProf = somaDir / j;

			}

			opcao = Leitor.lerCaractere("Deseja continuar? ");

		} while (opcao == 's');

		for (Diretor d : diretor) {
			System.out.println(d);

		}

		for (Professor p : professor) {
			System.out.println(p);
		}

	}
}
