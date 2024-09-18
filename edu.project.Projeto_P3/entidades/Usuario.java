package entidades;

public abstract class Usuario {
    protected String nome;
    protected String token;

    public Usuario() {
    }

    public Usuario(String nome, String token) {
        this.nome = nome;
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}