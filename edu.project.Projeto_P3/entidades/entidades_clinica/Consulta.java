package entidades.entidades_clinica;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String status;

    public Consulta(Paciente paciente, Medico medico, String data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.status = "Agendada";
    }

    public void StatusConsulta() {
        System.out.printf("Consulta entre %s e %s em %s.\nStatus: %s", paciente.getNome(), medico.getNome(), data, status);
    }

    public void cancelarConsulta() {
        this.status = "Cancelada";
        System.out.println("Consulta cancelada.");
    }

    public void concluirConsulta(String resultado) {
        this.status = "Concluída";
        System.out.println("Consulta concluída com resultado: " + resultado);
    }

    public String getData() {
        return data;
    }

}
