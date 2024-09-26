/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATOS.DAO;

import NEGOCIOS.UsuarioDTO;
import conexion.ConexionDTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author osval
 */
public class UsuarioDAO {
ConexionDTO conexionDTO = new ConexionDTO();

    // Método para agregar un nuevo usuario utilizando UsuarioDTO
    public int agregarUsuario(UsuarioDTO usuario) {
        int idGenerado = -1; // Valor por defecto en caso de error
        String query = "INSERT INTO Usuarios (nombre, correo, fecha_nacimiento, saldo, contrasena) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = conexionDTO.conectar(); PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setDate(3, usuario.getFecha_nacimiento());
            ps.setDouble(4, usuario.getSaldo());
            ps.setString(5, usuario.getContrasena());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        idGenerado = rs.getInt(1); // Obtén el ID generado
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
        }

        return idGenerado; // Retorna el ID generado o -1 en caso de error
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
                usuario.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
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
            ps.setDate(3, usuario.getFecha_nacimiento());
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
                usuario.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                usuario.setSaldo(rs.getDouble("saldo"));
                usuario.setContrasena(rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario: " + e.getMessage());
        }
        return usuario;
    }

    public boolean agregarSaldo(int idUsuario, double monto) {
        ConexionDTO conexionDTO = new ConexionDTO();
        try (Connection con = conexionDTO.conectar()) {
            // Obtener el saldo actual del usuario
            String obtenerSaldoQuery = "SELECT saldo FROM Usuarios WHERE id_usuario = ?";
            PreparedStatement obtenerSaldoStmt = con.prepareStatement(obtenerSaldoQuery);
            obtenerSaldoStmt.setInt(1, idUsuario);
            ResultSet rs = obtenerSaldoStmt.executeQuery();

            if (rs.next()) {
                double saldoActual = rs.getDouble("saldo");
                double nuevoSaldo = saldoActual + monto;

                // Actualizar el saldo con el nuevo valor
                String actualizarSaldoQuery = "UPDATE Usuarios SET saldo = ? WHERE id_usuario = ?";
                PreparedStatement actualizarSaldoStmt = con.prepareStatement(actualizarSaldoQuery);
                actualizarSaldoStmt.setDouble(1, nuevoSaldo);
                actualizarSaldoStmt.setInt(2, idUsuario);

                int filasActualizadas = actualizarSaldoStmt.executeUpdate();
                return filasActualizadas > 0; // Retorna true si se actualizó el saldo
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar saldo: " + e.getMessage());
            return false;
        }
    }
}
