package aplicacao;

import entidade.Aluno;
import entidade.Aluno_Disciplina;
import entidade.Disciplina;

public class Programa08 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(1, "Kaio", "3244-7524");
		Disciplina disciplina = new Disciplina(1, "Matemática");

		Aluno_Disciplina aluno_disciplina = new Aluno_Disciplina(1, aluno, disciplina);
		
		System.out.println("Alunos por disciplina");
		System.out.println("ID: " + aluno_disciplina.getId());
		System.out.println("Aluno: " + aluno_disciplina.getAluno().getNome());
		System.out.println("Disciplina: " + aluno_disciplina.getDisciplina().getNome());
	}

}
