package entities;

public class Disciplinas {
	private String Disciplina1;
	private String Disciplina2;
	private String Disciplina3;
	private String Disciplina4;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Double nota4;
	public String getDisciplina1() {
		return Disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		Disciplina1 = disciplina1;
	}
	public String getDisciplina2() {
		return Disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		Disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return Disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		Disciplina3 = disciplina3;
	}
	public String getDisciplina4() {
		return Disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		Disciplina4 = disciplina4;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double getNota4() {
		return nota4;
	}
	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Disciplina1 == null) ? 0 : Disciplina1.hashCode());
		result = prime * result + ((Disciplina2 == null) ? 0 : Disciplina2.hashCode());
		result = prime * result + ((Disciplina3 == null) ? 0 : Disciplina3.hashCode());
		result = prime * result + ((Disciplina4 == null) ? 0 : Disciplina4.hashCode());
		result = prime * result + ((nota1 == null) ? 0 : nota1.hashCode());
		result = prime * result + ((nota2 == null) ? 0 : nota2.hashCode());
		result = prime * result + ((nota3 == null) ? 0 : nota3.hashCode());
		result = prime * result + ((nota4 == null) ? 0 : nota4.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		if (Disciplina1 == null) {
			if (other.Disciplina1 != null)
				return false;
		} else if (!Disciplina1.equals(other.Disciplina1))
			return false;
		if (Disciplina2 == null) {
			if (other.Disciplina2 != null)
				return false;
		} else if (!Disciplina2.equals(other.Disciplina2))
			return false;
		if (Disciplina3 == null) {
			if (other.Disciplina3 != null)
				return false;
		} else if (!Disciplina3.equals(other.Disciplina3))
			return false;
		if (Disciplina4 == null) {
			if (other.Disciplina4 != null)
				return false;
		} else if (!Disciplina4.equals(other.Disciplina4))
			return false;
		if (nota1 == null) {
			if (other.nota1 != null)
				return false;
		} else if (!nota1.equals(other.nota1))
			return false;
		if (nota2 == null) {
			if (other.nota2 != null)
				return false;
		} else if (!nota2.equals(other.nota2))
			return false;
		if (nota3 == null) {
			if (other.nota3 != null)
				return false;
		} else if (!nota3.equals(other.nota3))
			return false;
		if (nota4 == null) {
			if (other.nota4 != null)
				return false;
		} else if (!nota4.equals(other.nota4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disciplinas [Disciplina1=" + Disciplina1 + ", Disciplina2=" + Disciplina2 + ", Disciplina3="
				+ Disciplina3 + ", Disciplina4=" + Disciplina4 + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", nota4=" + nota4 + "]";
	}
	
	
}
