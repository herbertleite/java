package config;

import informes.Relatorio;
import manager.FileManager;
import programa.Menu;

public class Init {

    public static void loadFiles(){
        //Menu.principal();  //Mostrando menú principal
        
        System.out.println();
        FileManager.carregarClientes();     //Carrega un numero indeterminado de clientes predefinidos desde o arquivo clientes.txt
        Relatorio.clientes();              //Mostrando Clientes carregados na lista
        
        System.out.println();
        FileManager.carregarProfessores(); //Carrega un numero indeterminado de professores predefinidos desde o arquivo professores.txt
        Relatorio.professores();          //Mostrando Professores carregados na lista
        System.out.println();
        System.out.println();
    }
}
