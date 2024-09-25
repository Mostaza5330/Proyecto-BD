package NEGOCIOS;
import java.sql.Date;

/**
 *
 * @author osval
 */
public class UsuarioDTO {
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private double saldo;
    private String contrasena;

    // Constructor vacío
    public UsuarioDTO() {}

    // Constructor con todos los campos
    public UsuarioDTO(String nombre, String correo, Date fechaNacimiento, double saldo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método toString() para depuración
    @Override
    public String toString() {
        return "UsuarioDTO{" +
               "nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               ", fechaNacimiento=" + fechaNacimiento +
               ", saldo=" + saldo +
               ", contrasena='" + contrasena + '\'' +
               '}';
    }
    
}