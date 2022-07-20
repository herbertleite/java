package application;
import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplinas;

public class Program {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String data = JOptionPane.showInputDialog("Qual a data de matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
		
		for(int pos=1;pos<=4;pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina"+ pos +"?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina"+ pos +"?");
			Disciplinas disciplina = new Disciplinas();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		/*
		aluno1.setNome("Herbert");
		aluno1.setDataMatricula("15/08/1996");
		aluno1.setSerie(5);
		*/
		
		
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
