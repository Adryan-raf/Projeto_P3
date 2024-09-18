package DAO;

import conexao.Conex;
import entidades.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pacienteDAO {
    public void cadastraUsuario(Paciente usuario){
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
