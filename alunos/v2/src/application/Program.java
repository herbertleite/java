package application;
import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplinas;

public class Program {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		Disciplinas disciplina1 = new Disciplinas();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		
		Disciplinas disciplina3 = new Disciplinas();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		Disciplinas disciplina4 = new Disciplinas();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		/*
		aluno1.setNome("Herbert");
		aluno1.setDataMatricula("15/08/1996");
		aluno1.setSerie(5);
		*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String data = JOptionPane.showInputDialog("Qual a data de matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
		
		aluno1.setNome(nome);
		aluno1.setDataMatricula(data);
		aluno1.setSerie(Integer.valueOf(serie));
	
		/**/
		System.out.println("Aluno: "+ aluno1.getNome());
		System.out.println("Matriculado em: "+ aluno1.getDataMatricula());
		System.out.println("Serie: "+ aluno1.getSerie());
		 System.out.println(" Media: "+aluno1.getMedia());
		 
		System.out.print("Situacao: "); 
		 if(aluno1.getAlunoAprovado())
		System.out.println("Aluno Aprovado");
		else
		 System.out.println("Aluno Reprovado");
		 
		//System.out.println(aluno1.toString());
		//System.out.println(aluno1);
	}
}
