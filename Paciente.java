public class Paciente{
    String nome;
    String telefone;
    String email;
    int ID;
    String CPF;
    String endereco;
    
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