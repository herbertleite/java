package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String dataMatricula;
	private Integer serie;
	private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

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

	public double getMedia() {
		double somaNotas = 0.0;

		for (Disciplinas disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public String getAlunoAprovado() {
		Double mediaDouble = this.getMedia();
		if (mediaDouble >= 50) {
			if (mediaDouble >= 70) {
				return "Aluno Aprovado";
			} else {
				return "Aluno me Recuperação";
			}
		} else {
			return "Aluno Reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataMatricula=" + dataMatricula + ", serie=" + serie + "]";
	}

}
