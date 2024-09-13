public class Medico{
    private String nome;
    private String telefone;
    private String email;
    private int ID;
    private String CPF;
    private String especialidade;
    
    Medico(String nome){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ID = ID;
        this.CPF = CPF;
        this.especialidade = especialidade;
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

    String getNome(){
        this.especialidade = especialidade;
    }
    
    void setEspecialidade(String especialidade){
        return especialidade;
    }
}
