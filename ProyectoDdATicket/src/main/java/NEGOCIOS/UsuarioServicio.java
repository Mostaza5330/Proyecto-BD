package NEGOCIOS;

/**
 *
 * @author osval
 */
import DATOS.DAO.UsuarioDAO;

public class UsuarioServicio {

    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() {
        usuarioDAO = new UsuarioDAO();
    }

    public int registrarUsuario(UsuarioDTO usuario) {
        // Validaciones previas
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (usuario.getCorreo() == null || usuario.getCorreo().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede estar vacío.");
        }
        if (usuario.getContrasena() == null || usuario.getContrasena().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }
        int idUsuario = usuarioDAO.agregarUsuario(usuario);
        if (idUsuario > 0) {
            usuario.setId_usuario(idUsuario); // Establece el ID en el objeto UsuarioDTO
            return idUsuario; // Retorna el ID del usuario registrado
        } else {
            throw new IllegalStateException("No se pudo registrar el usuario.");
        }

    }

    public boolean agregarSaldo(UsuarioDTO usuario, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero.");
        }

        // Verifica que el usuario tiene un ID válido
        if (usuario.getId_usuario() <= 0) {
            throw new IllegalArgumentException("El ID del usuario no es válido.");
        }

        return usuarioDAO.agregarSaldo(usuario.getId_usuario(), monto); // Usa el ID para agregar saldo
    }

}
