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
    }
    
    String getNome(){
        this.nome = nome;
    }
    
    void setNome(String nome){
        return nome;
    }
}