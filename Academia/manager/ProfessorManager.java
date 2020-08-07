package manager;

import dados.Professor;
import java.util.ArrayList;

public class ProfessorManager {
    public static ArrayList<Professor> listaProfessores = new ArrayList<>();

    public static void carregarLista() {
        listaProfessores.add(new Professor(
                "Ronaldo", "123123123", "um Cpf", "jow@tromundo.com" 
            )
        );
    }//Fin do metodo carregarLista

    public static void carregarProfessor(String nome, String telefone, String cpf, String email) {
        listaProfessores.add(new Professor(nome, telefone, cpf, email));
    }//fin de carregar cliente

    public static void getProfessor(int n) {
        System.out.println(
                listaProfessores.get(n).nome        + ", " +
                listaProfessores.get(n).telefone    + ", " +
                listaProfessores.get(n).cpf         + ", " +
                listaProfessores.get(n).email       + "."
        );
    }//Fin do metodo getProfessor
}
