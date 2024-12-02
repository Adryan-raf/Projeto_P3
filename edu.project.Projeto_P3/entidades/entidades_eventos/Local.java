package entidades.entidades_eventos;

import java.util.ArrayList;
import java.util.List;

public class Local implements Buscavel<Local> {
    private String nome;
    private int capacidade;
    private boolean disponivel;
    private List<Event> eventos;

    public Local(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.disponivel = true;
        this.eventos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Event> getEventos() {
        return new ArrayList<>(eventos);
    }

    public boolean adicionarEvento(Event evento) {
        if (disponivel && evento.getCapacidade() <= capacidade) {
            eventos.add(evento);
            return true;
        }
        return false;
    }

    public boolean verificarOcupacao() {
        return !eventos.isEmpty();
    }

    @Override
    public Local buscar(String nome) {
        return this.nome.equalsIgnoreCase(nome) ? this : null;
    }

    public boolean capacidadeSuficiente(int capacidadeRequerida) {
        return capacidade >= capacidadeRequerida;
    }

    public boolean removerEvento(String nomeEvento) {
        return eventos.removeIf(e -> e.getNomeEvento().equalsIgnoreCase(nomeEvento));
    }
    
    @Override
    public String toString() {
        return nome + " (Capacidade: " + capacidade + ", Disponível: " + (disponivel ? "Sim" : "Não") + ")";
    }
}
