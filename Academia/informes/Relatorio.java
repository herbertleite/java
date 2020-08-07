/*
 * 8. O programa também deve gerar, em tela, as seguintes listagens (os relatórios 
 * devem exibir todos os atributos do objeto):
 * – Relatório de clientes;
 * – Relatório de professores;
 * – Relatório de turmas;
 * – Relatório de serviços;
 * – Relatório de turmas para uma determinada data;
 * – Relatório de alunos por situação (ativo/inativo);
 * – Relatório de aulas já realizadas por determinado aluno. Este relatório de aulas já
 * realizadas por determinado aluno deve possibilitar ao usuário a opção de ordenar 
 * por código da aula, data da aula ou nome do serviço (musculação, pilates, etc).
 * *manter = incluir, alterar, excluir, consultar
*/
package informes;

import manager.ProfessorManager;
import manager.ClienteManager;

public class Relatorio{
    public static void professores(){
        for ( int i = 0; i < (int)ProfessorManager.listaProfessores.size(); i++ ){
            ProfessorManager.getProfessor(i);
        }
    }    

    public static void clientes(){
        for ( int i = 0; i < (int)ClienteManager.listaClientes.size(); i++ ){
            ClienteManager.getCliente(i);
        }        
    }     
}

