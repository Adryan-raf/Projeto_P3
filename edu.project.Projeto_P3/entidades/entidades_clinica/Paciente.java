package entidades.entidades_clinica;

import java.util.ArrayList;

public class Paciente extends Usuario {

    private String plano;
    private String condicao;
    private ArrayList<Consulta> prontuario;

    public Paciente(String nome,  String CPF, String email, String senha, String telefone,String condicao, String plano) {
        super(nome, email, senha, telefone, CPF);

        this.plano = plano;
        this.prontuario = new ArrayList<>();
        this.condicao = condicao;

    }

    public Paciente() {
    }

    @Override
    public void status() {
        System.out.printf("Paciente: %s\nCondição: %s\nPlano de Saúde: %s\n", this.nome, this.condicao, this.plano);
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public void adicionarConsultaProntuario(Consulta consulta) {
        prontuario.add(consulta);
    }

    public void exibirProntuario() {
        System.out.println("Prontuário do Paciente " + getNome() + ":");
        if (prontuario.isEmpty()) {
            System.out.println("Nenhuma consulta realizada.");
        } else {
            for (Consulta consulta : prontuario) {
                consulta.StatusConsulta();
            }
        }
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public ArrayList<Consulta> getProntuario() {
        return prontuario;
    }
}