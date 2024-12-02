package entidades.entidades_eventos;

import java.util.ArrayList;
import java.util.List;

public class Event implements Buscavel<Event> {
    private String nomeEvento;
    private int capacidade;
    private List<Participante> participantes;
    private int local;

    public Event(String nomeEvento, int capacidade, int local) {
        this.nomeEvento = nomeEvento;
        this.capacidade = capacidade;
        this.participantes = new ArrayList<>();
        this.local = local;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getParticipantesInscritos() {
        return participantes.size();
    }

    public int getLocal() {
        return local;
    }

    public boolean adicionarParticipante(Participante participante) {
        if (participantes.size() < capacidade) {
            participantes.add(participante);
            return true;
        }
        return false;
    }

    public boolean removerParticipante(String nome) {
        return participantes.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public List<Participante> listarParticipantes() {
        return new ArrayList<>(participantes);
    }

    @Override
    public Event buscar(String nome) {
        return this.nomeEvento.equalsIgnoreCase(nome) ? this : null;
    }

    public Participante buscarParticipante(String nome) {
        for (Participante p : participantes) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public List<Participante> buscarParticipantesPorParteDoNome(String parteNome) {
        List<Participante> resultados = new ArrayList<>();
        for (Participante p : participantes) {
            if (p.getNome().toLowerCase().contains(parteNome.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public String mostrarEstatisticas() {
        StringBuilder estatisticas = new StringBuilder();
        estatisticas.append(nomeEvento)
                    .append(" (")
                    .append(getParticipantesInscritos())
                    .append(" / ")
                    .append(capacidade)
                    .append(")\n");
        estatisticas.append("Participantes:\n");
        for (Participante p : participantes) {
            estatisticas.append("- ").append(p.getNome()).append("\n");
        }
        return estatisticas.toString();
    }

    @Override
    public String toString() {
        return nomeEvento + " (" + getParticipantesInscritos() + "/" + capacidade + ")";
    }
}
