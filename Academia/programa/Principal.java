    /*
 Uma academia oferece ao público diversos serviços, como *musculação, *aulas 
 aeróbicas, *pilates, entre *outros. Todas as aulas dessa academia ocorrem com 
 "turmas fechadas" de no "máximo" *5 alunos, e têm duração de *1 hora cada. Essa 
 academia precisa "efetuar o controle dos clientes, professores, serviços", e 
 possuir uma agenda para controlar as turmas. Para tanto, você deve esenvolver 
 um programa em Java que faça este controle.
    
 -5. Deve haver um módulo no programa que exiba a agenda completa de um dia, exibindo
 todos os dados das turmas daquele dia;
 -6. Deve ser permitido ao atendente marcar horário para um aluno rapidamente, pois o
 mesmo pode estar ao telefone aguardando o agendamento. No momento de se marcar
 um horário, o sistema deve informar ao atendente todos os horários livres de determinada
 modalidade em determinada data, para que o atendente escolha a turma onde o aluno
 será matriculado;
 -7. Deve ser permitido aos alunos remarcar horários (alterar de uma turma para outra);    
    
 */
package programa;
import config.Init;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public void tecla(java.awt.event.KeyEvent evt) {

        System.out.println(evt.getKeyCode());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("PULSO ENTER");
        }
    }
   
    public static void main(String[] args) throws IOException {
        Init.loadFiles();
        Menu.principal();
        System.err.println("Error");
        
        char caracter = 0;
        while (caracter != '0') {
            caracter = (char)System.in.read();
            System.out.print((char) caracter);
        }

        
        
        
    }//Fin de main


}
