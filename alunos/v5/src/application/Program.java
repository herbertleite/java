package application;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplinas;

public class Program {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for(int qtd =0; qtd<=1; qtd++) {
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+ qtd +" ?");
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
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover==0) {
			String DisciplinaRemover = JOptionPane.showInputDialog("Qual 1,2,3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(DisciplinaRemover).intValue()-posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover? ");
		}
		}
		alunos.add(aluno1);
		aluno1.setNome(nome);
		/*
		aluno1.setDataMatricula(data);
		aluno1.setSerie(Integer.valueOf(serie));
		*/
	}
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println("Aluno: "+ aluno.getNome());
			System.out.println(" Media: "+aluno.getMedia());
			System.out.print("Situacao: "); 
			System.out.println(aluno.getAlunoAprovado());
			System.out.println("___________________________________________________");
		}
}
}
