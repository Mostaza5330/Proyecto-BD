/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Presentacion.GUI;

import conexion.ConexionDTO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author eduar
 */
public class TicketWizard {

    public static void main(String[] args) {
        ConexionDTO conexion = new ConexionDTO();
        try {
            Connection cnx = conexion.conectar();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
