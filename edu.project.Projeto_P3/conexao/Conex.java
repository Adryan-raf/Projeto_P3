package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conex {
    private static final String url = "jdbc:mysql://localhost:3306/project_db";
    private static final String user ="root";
    private static final String password="astayun102023";

    private static Connection connection;

    public static Connection getConnection  () {
        try {
            if (connection==null) {
                connection = DriverManager.getConnection(url, user, password);
                return connection;
            }
            return connection;
        }catch (SQLException e) {
                System.out.println("Conexão não encontrada");
                return null;
        }
    }
}
