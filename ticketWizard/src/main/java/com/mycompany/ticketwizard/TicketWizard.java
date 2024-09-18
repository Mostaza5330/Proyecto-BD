/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ticketwizard;

import DATOS.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author eduar
 */
public class TicketWizard {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try {
            Connection cnx = conexion.conectar();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
