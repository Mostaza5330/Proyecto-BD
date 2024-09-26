package NEGOCIOS;

import java.sql.Date;

/**
 *
 * @author osval
 */
public class UsuarioDTO {

    private int id_usuario; // ID autoincrementable
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private double saldo;
    private String contrasena;

    public UsuarioDTO(){
        
    }
    // Constructor que incluye el ID
    public UsuarioDTO(int id_usuario, String nombre, String correo, Date fechaNacimiento, double saldo, String contrasena) {
        this.id_usuario = id_usuario; // Asignación del ID
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.contrasena = contrasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public Date getFecha_nacimiento() {
        return fechaNacimiento;
    }

    public void setFecha_nacimiento(Date fechaNacimiento) {
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
        return "UsuarioDTO{"
                + "nombre='" + nombre + '\''
                + ", correo='" + correo + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", saldo=" + saldo
                + ", contrasena='" + contrasena + '\''
                + '}';
    }

}
