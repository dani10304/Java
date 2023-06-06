package com.empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.empresa.model.Usuario;

public class UsuarioDAO {
    
    //Data Access Object: capa de datos
    //Comunicación CRUD con la fuente de datos
    private String endpoint = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private String usuario = "root";
    private String password = "";
    
    //Constructor. Permite instanciar la clase con new
    public UsuarioDAO() {}
    
    public Connection conectar() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection  = DriverManager.getConnection(endpoint, usuario, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    } //cierra conectar
    
    public void addUsuario(Usuario u) {
        // try-with-resource statement will auto close the connection.

            Connection connection = conectar(); 
            PreparedStatement ps;
            try {
                ps = connection.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?);");
                ps.setInt(1, u.getId());
                ps.setString(2, u.getNombre());
                ps.setString(3, u.getCiudad());
                ps.setFloat(4, u.getPrecio());
                ps.executeUpdate();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


    } //cierra add
}//cierra DAO