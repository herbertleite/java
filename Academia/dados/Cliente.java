package dados;

public class Cliente{  
    //2. Sobre um cliente, deseja-se manter os dados de cpf, nome, telefone, 
    //e-mail, endereço completo, data de nascimento, sexo, estado civil e 
    //situação (ativo/inativo);
    public String nome;
    public String sexo;
    public String dataNascimento;
    public String estadoCivil;
    public String cpf;
    public String telefone;
    public String endereco;
    public String email;           
    public String situacao;

    public Cliente(){}

    public Cliente( 
        String nome,
        String sexo,
        String dataNascimento,
        String estadoCivil,
        String cpf,
        String telefone,
        String endereco,
        String email,           
        String situacao ){    
      
        this.nome           = nome;
        this.sexo           = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil    = estadoCivil;
        this.cpf            = cpf;
        this.telefone       = telefone;
        this.endereco       = endereco;
        this.email          = email;         
        this.situacao       = situacao;
    }
}    
