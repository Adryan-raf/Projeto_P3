package entidades;

public abstract class Usuario {
    protected String nome;
    protected String login;
    protected String senha;
    protected String email;
    protected String CPF;
    protected String telefone;

    public Usuario(String nome, String login, String senha, String email, String CPF, String telefone){
        this.nome=nome;
        this.login=login;
        this.senha=senha;
        this.email=email;
        this.CPF=CPF;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
