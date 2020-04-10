package Main;

import java.util.ArrayList;

import Entities.Diretor;
import Entities.Funcionario;
import Entities.Professor;
import Leitor.Leitor;

public class Main {

	public static void main(String[] args) {

		ArrayList<Funcionario> listaFuncio = new ArrayList<Funcionario>();
		char opcao = 'n';
		char op;
		double somaProf = 0;
		int i = 0;
		int j = 0;
		double mediaProf;
		double somaDir = 0;
		do {
			op = Leitor.lerCaractere("Cadastrar Diretor ou Professor: ");
			if (op == 'p') {
				Professor prof = new Professor(Leitor.lerInt("Digite a Matricula: "));
				prof.addProf();
				i++;
				somaProf += prof.getImpostoDeRenda();
				mediaProf = somaProf / i;
				listaFuncio.add((Professor) prof);
			} else if (op == 'd') {
				Diretor dir = new Diretor(Leitor.lerInt("Digite a Matricula: "));
				dir.addDir();
				j++;
				somaDir += dir.getImpostoDeRenda();
				mediaProf = somaDir / j;
				listaFuncio.add(dir);
			}
			opcao = Leitor.lerCaractere("Deseja continuar? ");
		} while (opcao == 's');

		for (Funcionario d : listaFuncio) {
			System.out.println(d);
		}
	}
}
