public class Medico{
    private String nome;
    private String telefone;
    private String email;
    private int ID;
    private String CPF;
    private String especialidade;
    
    Medico(String nome){
        this.nome = nome;
    }
    
    String getNome(){
        this.nome = nome;
    }
    
    void setNome(String nome){
        return nome;
    }
}