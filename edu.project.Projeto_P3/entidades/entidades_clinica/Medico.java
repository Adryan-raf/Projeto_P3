package entidades.entidades_clinica;

import java.util.ArrayList;

public class Medico extends Usuario {

    private String especialidade;
    private String turno;
    private ArrayList<Consulta> agenda;

    public Medico(String nome, String CPF, String email, String senha, String telefone, String especialidade, String turno) {
        super(nome, email, senha, telefone, CPF);
        this.especialidade = especialidade;
        this.turno = turno;
        this.agenda = new ArrayList<>();
    }
    @Override
    public void status() {
        System.out.printf("Paciente: %s\nEspecialidade: %s\nTurno de Atendimento: %s\n", this.nome, this.especialidade, this.turno);
    }

    public Medico(){}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean disponibilidade(String data) {
        for (Consulta consulta : agenda) {
            if (consulta.getData().equals(data)) {
                return false;
            }
        }
        return true;
    }

    public void adicionarConsultaAgenda(Consulta consulta) {
        agenda.add(consulta);
    }


}
