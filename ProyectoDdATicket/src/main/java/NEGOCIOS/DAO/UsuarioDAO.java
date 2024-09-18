/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIOS.DAO;

import DATOS.DTO.UsuarioDTO;
import conexion.ConexionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author osval
 */
public class UsuarioDAO {
    
    // Método para agregar un nuevo usuario utilizando UsuarioDTO
    public void agregarUsuario(UsuarioDTO usuario) {
        ConexionDTO conexionDTO = new ConexionDTO();
        try (Connection con = conexionDTO.conectar()) {
            String query = "INSERT INTO Usuarios (nombre, correo, fecha_nacimiento, saldo, contrasena) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setDate(3, usuario.getFechaNacimiento());
            ps.setDouble(4, usuario.getSaldo());
            ps.setString(5, usuario.getContrasena());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
        }
    }

    // Método para listar todos los usuarios y devolverlos como objetos UsuarioDTO
    public List<UsuarioDTO> listarUsuarios() {
        ConexionDTO conexionDTO = new ConexionDTO();
        List<UsuarioDTO> usuarios = new ArrayList<>();
        try (Connection con = conexionDTO.conectar()) {
            String query = "SELECT * FROM Usuarios";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                usuario.setSaldo(rs.getDouble("saldo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    // Método para actualizar un usuario utilizando UsuarioDTO
    public void actualizarUsuario(UsuarioDTO usuario) {
        ConexionDTO conexionDTO = new ConexionDTO();
        try (Connection con = conexionDTO.conectar()) {
            String query = "UPDATE Usuarios SET nombre = ?, correo = ?, fecha_nacimiento = ?, saldo = ?, contrasena = ? WHERE id_usuario = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setDate(3, usuario.getFechaNacimiento());
            ps.setDouble(4, usuario.getSaldo());
            ps.setString(5, usuario.getContrasena());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario: " + e.getMessage());
        }
    }

    // Método para eliminar un usuario por ID
    public void eliminarUsuario(int id) {
        ConexionDTO conexionDTO = new ConexionDTO();
        try (Connection con = conexionDTO.conectar()) {
            String query = "DELETE FROM Usuarios WHERE id_usuario = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
        }
    }

    // Método para obtener un usuario por su ID
    public UsuarioDTO obtenerUsuarioPorId(int id) {
        ConexionDTO conexionDTO = new ConexionDTO();
        UsuarioDTO usuario = null;
        try (Connection con = conexionDTO.conectar()) {
            String query = "SELECT * FROM Usuarios WHERE id_usuario = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDTO();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                usuario.setSaldo(rs.getDouble("saldo"));
                usuario.setContrasena(rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario: " + e.getMessage());
        }
        return usuario;
    }
    
}

