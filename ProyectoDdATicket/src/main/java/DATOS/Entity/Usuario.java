
package DATOS.Entity;

/**
 *
 * @author angelsn
 */
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private BigDecimal saldo;
    private String contrasena;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor completo
    public Usuario(int idUsuario, String nombre, String correo, Date fechaNacimiento, BigDecimal saldo, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.contrasena = contrasena;
    }
    
    // Constructor sin ID
    public Usuario(String nombre, String correo, Date fechaNacimiento, BigDecimal saldo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.contrasena = contrasena;
    }
    

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Sobrescribir hashCode y equals para comparar objetos Usuario
    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, correo, fechaNacimiento, saldo, contrasena);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return idUsuario == usuario.idUsuario && Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(correo, usuario.correo) && Objects.equals(fechaNacimiento, usuario.fechaNacimiento) &&
                Objects.equals(saldo, usuario.saldo) && Objects.equals(contrasena, usuario.contrasena);
    }

}

