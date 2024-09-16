package DAO;

import entidades.Usuario;
import conexao.Conex;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDAO {
    public void cadastraUsuario(Usuario usuario){

        String sql= "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL, CPF) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = Conex.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getCPF());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
