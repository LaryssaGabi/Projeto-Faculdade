package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection getConnection() throws Exception {
        try {
            // Estabelece uma conexão com o banco de dados MySQL usando JDBC.
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "root");
        } catch (SQLException ex) {
            // Em caso de falha, imprime o erro no console.
            System.err.println(ex);
        }
        return null;// Retorna null se a conexão não puder ser estabelecida.
    }
}
