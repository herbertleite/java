package dados;

public class Professor{      
    //3. Sobre os professores, deseja-se manter os dados de cpf, nome, telefone e e-mail;
    public String nome;
    public String telefone;
    public String email;           
    public String cpf;
    
    public Professor(){}
    
    public Professor( String nome, String telefone, String cpf, String email ){
        this.nome           = nome;
        this.telefone       = telefone;
        this.cpf            = cpf;
        this.email          = email;         
    }
    

}
