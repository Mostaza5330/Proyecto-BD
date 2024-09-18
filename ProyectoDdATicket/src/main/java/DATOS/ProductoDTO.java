/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATOS;

import conexion.IConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author eduar
 */
public class ProductoDTO implements IProducto{
    private IConexion conexion;
    
    @Override
    public boolean agregar(Producto producto) {
        Connection bd = conexion.crearConexion();
        try {
            String insertar = "INSERT INTO producto (nombre, descripcion, precio)";
            PreparedStatement i = bd.prepareStatement(insertar);
            i.setString(1, producto.getNombre());
            i.setString(2, producto.getDescripcion());
            i.setFloat(3, producto.getPrecio());
            i.executeUpdate();
        } catch (SQLException e) {

            System.out.println("No inserta");
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
       Connection bd = conexion.crearConexion();
        String eliminar = "DELETE FROM Producto WHERE id = ?";
        try {
            PreparedStatement i = bd.prepareStatement(eliminar);
            i.setInt(1, id);
            i.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No elimina");
        }
        return false; 
    }

    @Override
    public boolean actualizar(Producto producto) {
        Connection bd = conexion.crearConexion();

        try {
            String actualizar = "UPDATE Producto SET nombre = ?, descripcion = ?, precio = ? WHERE id = ?";
            PreparedStatement i = bd.prepareStatement(actualizar);
            i.setString(1,producto.getNombre());
            i.setString(2, producto.getDescripcion());
            i.setFloat(3, producto.getPrecio());
            i.setInt(4, producto.getId());
            i.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No actualiza");
        }
        return false;
    }

    @Override
    public Producto consultar(int id) {
        Connection bd = conexion.crearConexion();
        String consultar = "SELECT * FROM Producto WHERE id = ?";
        try (PreparedStatement i = bd.prepareStatement(consultar)) {
            i.setInt(1, id);
            ResultSet a = i.executeQuery();
            if (a.next()) {
                return new Producto(
                        a.getInt("id"),
                        a.getString("nombre"),
                        a.getString("descripcion"),
                        a.getFloat("precio")
                );
            }
        } catch (SQLException e) {

        }
        return null;
    }

    @Override
    public List<Producto> consultar() {
    Connection bd = conexion.crearConexion();
    List<Producto> productos = new ArrayList<>();
    String consultar = "SELECT * FROM Producto";
    try (Statement i = bd.createStatement()) {
        ResultSet a = i.executeQuery(consultar);
        while (a.next()) {
            productos.add(new Producto(
                    a.getInt("id"),
                    a.getString("nombre"),
                    a.getString("descripcion"),
                    a.getFloat("precio")
            ));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (bd != null && !bd.isClosed()) {
                bd.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return productos;
}
}
