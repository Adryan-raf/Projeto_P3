package entidades;

public class Paciente{
    private String nome;
    private String telefone;
    private String email;
    private int ID;
    private String CPF;
    private String endereco;
    
    Paciente(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
        this.ID = ID;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    String getNome(){
        this.nome = nome;
    }
    
    void setNome(String nome){
        return nome;
    }

    String getTelefone(){
        this.telefone = telefone;
    }
    
    void setTelefone(String telefone){
        return telefone;
    }

    String getEmail(){
        this.email = email;
    }
    
    void setEmail(String email){
        return email;
    }

    int getID(){
        this.ID = ID;
    }
    
    void setID(int ID){
        return ID;
    }

    String getCPF(){
        this.CPF = CPF;
    }
    
    void setCPF(String CPF){
        return CPF;
    }

    String getEndereco(){
        this.endereco = endereco;
    }

    void setEndereco(String endereco){
        return endereco;
    }
}
