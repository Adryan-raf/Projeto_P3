package entidades;

public class Paciente extends Usuario{

    private String condicao;

    public Paciente(String nome, String login, String senha, String email, String CPF, String telefone, String condicao){

        super(nome, login, senha, email, CPF, telefone);

        this.condicao = condicao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}
