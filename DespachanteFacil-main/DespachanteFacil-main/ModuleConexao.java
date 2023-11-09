package controller;

import java.sql.*;

public class ModuleConexao {

   
    public static Connection conectar() {
        Connection conexao = null;
        String driver = "org.postgresql.Driver"; 
        String url = "jdbc:postgresql://localhost:5432/despachantefacil"; 
        String user = "postgres"; 
        String senha = "123"; 

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    // Método para fechar a conexão
    public static void desconectar(Connection conexao) {
        try {
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
