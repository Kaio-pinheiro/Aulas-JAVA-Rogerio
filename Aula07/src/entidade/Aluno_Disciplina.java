package entidade;

public class Aluno_Disciplina {

	private int id;
	private Aluno aluno;
	private Disciplina disciplina;
	
	public Aluno_Disciplina(int id, Aluno aluno, Disciplina disciplina) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno_Disciplina [id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + "]";
	}
	
	
}
