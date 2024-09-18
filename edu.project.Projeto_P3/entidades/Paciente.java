package entidades;

public class Paciente extends Usuario{

    private String condicao;

    public Paciente(String nome, String token){

        super(nome, token);

        this.condicao = condicao;
    }

    public Paciente(){}

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}
