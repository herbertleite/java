package manager;
import java.io.File;
import java.util.Scanner;
import manager.ClienteManager;
public class FileManager {
    
    /*
    * Carrega clientes desde uma fichero de texto que esta na pasta 
    * "src/clientes.txt". Iso acontece linha por linha, cada linha é um cliente
    * e todas as linhas que estiverem corretamente escritas no arquivo serão 
    * carregadas e armazenadas no arrayList de clientes fazendo uso da clase 
    * clienteManager.
    */
    public static void carregarClientes() {
        File fichero = new File("src/clientes.txt");
        Scanner s = null;

        try {
            // Lè o conteudo do arquivo
            System.out.print("Carregando clientes.txt \n");
            s = new Scanner(fichero);
            String linea;
            // Lê linha por linha o arquivo.
            while (s.hasNextLine()) {    
                linea = s.nextLine(); 	// Guardamos la linea en un String
                clienteSpliter(linea); // Passamos cada linha do arquivo pela funçao clienteSpliter que separa todos os dados do cliente ja que se encontra em um unico string e o aloja na arrayList de clientes
            }
        } catch (Exception ex) {
            //Si não é possivel carregar o arquivo mostra o erro(possivel causa)
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // fechamos o arquivo sendo ou nao correta a leitura.
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }//Fin do metodo carregarClientes
    
    /*
    * Agrega um cliente na arraList de clientes desde um string obtido apartir 
    * de uma linha de texto de um arquivo chamado clientes.txt.
    */
    public static void clienteSpliter(String s){
                String[] dados = s.split(", ");
                ClienteManager.carregarCliente( 
                    dados[0], dados[1], dados[2],
                    dados[3], dados[4], dados[5],
                    dados[6], dados[7], dados[8]  
                );
    }//Fin do metodo clienteSpliter


    /*
    * Carrega Professores desde uma fichero de texto que esta na pasta 
    * "src/professores.txt". Iso acontece linha por linha, cada linha é um professor
    * e todas as linhas que estiverem corretamente escritas no arquivo serão 
    * carregadas e armazenadas no arrayList de professores fazendo uso da clase 
    * professorManager.
    */
    public static void carregarProfessores() {
        File fichero = new File("src/professores.txt");
        Scanner s = null;

        try {
            // Lè o conteudo do arquivo
            System.out.print("Carregando professores.txt \n");
            s = new Scanner(fichero);
            String linea;
            // Lê linha por linha o arquivo.
            while (s.hasNextLine()) {    
                linea = s.nextLine(); 	// Guardamos la linea en un String
                professorSpliter(linea); // Passamos cada linha do arquivo pela funçao professorSpliter que separa todos os dados do professor ja que se encontra em um unico string e o aloja na arrayList de professores.
            }
        } catch (Exception ex) {
            //Si não é possivel carregar o arquivo mostra o erro(possivel causa)
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // fechamos o arquivo sendo ou nao correta a leitura.
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }//Fin do metodo carregarProfessores
    
    /*
    * Agrega um "Professor" na arraList de professores desde um string obtido apartir 
    * de uma linha de texto de um arquivo chamado professores.txt.
    */
    public static void professorSpliter(String s){
        String[] dados = s.split(", ");
        ProfessorManager.carregarProfessor( dados[0], dados[1], dados[2],dados[3] );
    }//Fin do metodo professorSpliter
}
