
package DATOS.Entity;

/**
 *
 * @author angelsn
 */
import java.sql.Date;
import java.util.Objects;

public class Evento {
    private int idEvento;
    private String nombreEvento;
    private Date fechaEvento;
    private String venue;
    private String ciudad;
    private String estado;
    private String descripcion;

    // Constructor, getters y setters

    public Evento(int idEvento, String nombreEvento, Date fechaEvento, String venue, String ciudad, String estado, String descripcion) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.venue = venue;
        this.ciudad = ciudad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public Evento() {}

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idEvento;
        hash = 29 * hash + Objects.hashCode(this.nombreEvento);
        hash = 29 * hash + Objects.hashCode(this.fechaEvento);
        hash = 29 * hash + Objects.hashCode(this.venue);
        hash = 29 * hash + Objects.hashCode(this.ciudad);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (this.idEvento != other.idEvento) {
            return false;
        }
        if (!Objects.equals(this.nombreEvento, other.nombreEvento)) {
            return false;
        }
        if (!Objects.equals(this.venue, other.venue)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.fechaEvento, other.fechaEvento);
    }
    
    
}
