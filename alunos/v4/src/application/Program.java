package application;
import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplinas;

public class Program {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*
		String data = JOptionPane.showInputDialog("Qual a data de matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
		*/
		for(int pos=1;pos<=4;pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina"+ pos +"?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina"+ pos +"?");
			Disciplinas disciplina = new Disciplinas();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma Disciplica?");
		if(escolha == 0) {
			String DisciplinaRemover = JOptionPane.showInputDialog("Qual 1,2,3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(DisciplinaRemover).intValue()-1);
		}
		
		
		aluno1.setNome(nome);
		/*
		aluno1.setDataMatricula(data);
		aluno1.setSerie(Integer.valueOf(serie));
		*/
	
		System.out.println(aluno1);
		System.out.println("Aluno: "+ aluno1.getNome());
		/*
		System.out.println("Matriculado em: "+ aluno1.getDataMatricula());
		System.out.println("Serie: "+ aluno1.getSerie());
		 System.out.println(" Media: "+aluno1.getMedia());
		 */
		 
		System.out.print("Situacao: "); 
		System.out.println(aluno1.getAlunoAprovado());
	}
}
