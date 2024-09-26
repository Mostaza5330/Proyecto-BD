
package DATOS.Entity;

/**
 *
 * @author angelsn
 */
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class HistorialCompras {
    private int idHistorial;
    private String tipo;
    private Date fecha;
    private Time hora;
    private double monto;
    private int idBoleto;
    private int idComprador;
    private int idVendedor;

    // Constructor sin id
    public HistorialCompras(String tipo, Date fecha, Time hora, double monto, int idBoleto, int idComprador, int idVendedor) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.monto = monto;
        this.idBoleto = idBoleto;
        this.idComprador = idComprador;
        this.idVendedor = idVendedor;
    }

    // Constructor con id
    public HistorialCompras(int idHistorial, String tipo, Date fecha, Time hora, double monto, int idBoleto, int idComprador, int idVendedor) {
        this.idHistorial = idHistorial;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.monto = monto;
        this.idBoleto = idBoleto;
        this.idComprador = idComprador;
        this.idVendedor = idVendedor;
    }

    // Getters y Setters
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    // hashCode y equals
    @Override
    public int hashCode() {
        return Objects.hash(idHistorial, tipo, fecha, hora, monto, idBoleto, idComprador, idVendedor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HistorialCompras that = (HistorialCompras) obj;
        return idHistorial == that.idHistorial && Double.compare(that.monto, monto) == 0 && 
               idBoleto == that.idBoleto && idComprador == that.idComprador && idVendedor == that.idVendedor &&
               Objects.equals(tipo, that.tipo) && Objects.equals(fecha, that.fecha) && Objects.equals(hora, that.hora);
    }

    // toString
    @Override
    public String toString() {
        return "HistorialCompra{" +
                "idHistorial=" + idHistorial +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", monto=" + monto +
                ", idBoleto=" + idBoleto +
                ", idComprador=" + idComprador +
                ", idVendedor=" + idVendedor +
                '}';
    }
}

