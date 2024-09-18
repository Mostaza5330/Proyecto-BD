/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class ConexionDTO {

    public Connection conectar() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/ticketwizard?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "";
        try {
            // Registrar el Driver
            Class.forName(driver);
            // Obtener la conexión,pasamos argumentos (url, user y password) para establecer una conexion con la basse de datos
            Connection conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion realizada con exito");
            return conexion;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error CLASE NO ENCONTRADA: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
            throw e; // Para que el error sea visible en la clase principal
        }
        return null;
    }

}
