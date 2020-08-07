package utilidades;
import programa.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eventos implements KeyListener {
    
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));
        
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                //optionPointer;
                break;
            case KeyEvent.VK_DOWN:
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

}
