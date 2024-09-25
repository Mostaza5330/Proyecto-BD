package NEGOCIOS;

/**
 *
 * @author osval
 */
import DATOS.DAO.UsuarioDAO;
import NEGOCIOS.UsuarioDTO;

public class UsuarioServicio {

    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean registrarUsuario(UsuarioDTO usuario) {
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (usuario.getCorreo() == null || usuario.getCorreo().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede estar vacío.");
        }
        if (usuario.getContrasena() == null || usuario.getContrasena().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }

        return usuarioDAO.agregarUsuario(usuario);
    }

    public boolean agregarSaldo(int idUsuario, double monto) {
        if (monto <= 0) {
            return false; // Retorna false si el monto no es válido
        } else {
            return usuarioDAO.actualizarSaldo(idUsuario, monto);
        }
    }

}
