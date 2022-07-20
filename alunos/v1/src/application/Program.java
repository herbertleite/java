package application;
import javax.swing.JOptionPane;

import entities.Aluno;

public class Program {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		/*
		aluno1.setNome("Herbert");
		aluno1.setDataMatricula("15/08/1996");
		aluno1.setSerieMatriculado(5);
		aluno1.getDisciplina().setNota1(1d);
		aluno1.getDisciplina().setNota2(2d);
		aluno1.getDisciplina().setNota3(3d);
		aluno1.getDisciplina().setNota4(4d);
		*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String data = JOptionPane.showInputDialog("Qual a data de matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		aluno1.setNome(nome);
		aluno1.setDataMatricula(data);
		aluno1.setSerie(Integer.valueOf(serie));
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
	
		System.out.println("Aluno: "+ aluno1.getNome());
		System.out.println("Matriculado em: "+ aluno1.getDataMatricula());
		System.out.println("Serie: "+ aluno1.getSerie());
		System.out.println("Nota 1: "+ aluno1.getDisciplina().getNota1());
		 System.out.println("Nota 2: "+ aluno1.getDisciplina().getNota2());
		 System.out.println("Nota 3: "+ aluno1.getDisciplina().getNota3());
		 System.out.println("Nota 4: "+ aluno1.getDisciplina().getNota4());
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
