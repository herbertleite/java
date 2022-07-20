package entities;

public class Aluno {
	private String nome;
	private String dataMatricula;
	private Integer serie;
	private Disciplinas disciplina = new Disciplinas();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}

	public Double getMedia() {
		return (disciplina.getNota1()+disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	
	public Boolean getAlunoAprovado() {
		Double mediaDouble = this.getMedia();
		if(mediaDouble >= 5) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataMatricula=" + dataMatricula + ", serie=" + serie + ", disciplina="
				+ disciplina + "]";
	}
	
	

}
