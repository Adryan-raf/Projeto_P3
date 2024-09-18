package entidades;

public class Medico extends Usuario {

    private String especialidade;

    public Medico(String nome, String token){
        super(nome, token);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
