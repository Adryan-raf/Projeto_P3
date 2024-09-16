package entidades;

public class Medico extends Usuario {

    private String especialidade;

    public Medico(String nome, String login, String senha, String email, String CPF, String telefone, String especialidade){
        super(nome, login, senha, email, CPF, telefone);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
