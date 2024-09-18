package DAO;

import entidades.*;
import conexao.Conex;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDAO {
    public void cadastraUsuario(Usuario usuario){

        String sql= "INSERT INTO USUARIO (NOME, TOKEN) VALUES (?,?)";
        PreparedStatement ps = null;

        try {
            ps = Conex.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getToken());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
