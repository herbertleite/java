package programa;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Menu implements KeyListener {
    static boolean sair = false;
    static int op = 0;
    static int primeiraOpcao = 1;
    static int ultimaOpcao = 0;
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));
        
        op = 1;
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                if ( op == primeiraOpcao){
                    op = 0;
                }else{
                    op--;
                }
                break;
            case KeyEvent.VK_DOWN:
                if ( op == ultimaOpcao){
                    op = 0;
                }else{
                    op++;
                }                
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased=" + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }    
    
    
    public static void principal(){
        sair = false;
        while ( !sair ){
            //keyPressed();
        
        
        
        
        }
        
        System.out.println("MENU PRINCIPAL: ");
        System.out.println("1. Agendamento  ");
        System.out.println("2. Registro     ");
        System.out.println("3. Informes     ");
        System.out.println("0. Sair         ");         
    }

    public static void agendamento(){
        System.out.println("MENU AGENDAMENTO:   ");
        System.out.println("1. Marcar Horario   ");
        System.out.println("2. Remarcar Horario ");
        System.out.println("0. Sair             ");         
    }
    public static void registros(){
        System.out.println("MENU PRINCIPAL:         ");
        System.out.println("1. Registrar Cliente    ");
        System.out.println("2. Registrar Professor  ");
        System.out.println("3. Registrar Modalidade ");
        System.out.println("4. Registrar turmas     ");
        System.out.println("0. Sair                 ");         
    }    
    public static void informes(){
        System.out.println("MENU AGENDAMENTO:       ");
        System.out.println("1. informe alunos       ");
        System.out.println("2. informe professores  ");
        System.out.println("3. informe turmas       ");
        System.out.println("4. informe servicios    ");
        System.out.println("5. informe de turmas para uma determinada data      ");
        System.out.println("6. informe de alunos por situação (ativo/inativo);  ");
        //...
        System.out.println("0. Sair                 ");      
    
    }
}