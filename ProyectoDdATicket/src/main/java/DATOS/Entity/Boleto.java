
package DATOS.Entity;

/**
 *
 * @author angelsn
 */
import java.math.BigDecimal;
import java.util.Objects;

public class Boleto {
    private int idBoleto;
    private String numeroSerie;
    private String fila;
    private String asiento;
    private BigDecimal precioOriginal;
    private BigDecimal precioReventa;
    private int idEvento;
    private int idUsuario;

    // Constructor vacío
    public Boleto() {
    }
    
    // Constructor commpleto
    public Boleto(int idBoleto, String numeroSerie, String fila, String asiento, BigDecimal precioOriginal, BigDecimal precioReventa, int idEvento, int idUsuario) {
        this.idBoleto = idBoleto;
        this.numeroSerie = numeroSerie;
        this.fila = fila;
        this.asiento = asiento;
        this.precioOriginal = precioOriginal;
        this.precioReventa = precioReventa;
        this.idEvento = idEvento;
        this.idUsuario = idUsuario;
    }

    public Boleto(String numeroSerie, String fila, String asiento, BigDecimal precioOriginal, BigDecimal precioReventa, int idEvento, int idUsuario) {
        this.numeroSerie = numeroSerie;
        this.fila = fila;
        this.asiento = asiento;
        this.precioOriginal = precioOriginal;
        this.precioReventa = precioReventa;
        this.idEvento = idEvento;
        this.idUsuario = idUsuario;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public BigDecimal getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(BigDecimal precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public BigDecimal getPrecioReventa() {
        return precioReventa;
    }

    public void setPrecioReventa(BigDecimal precioReventa) {
        this.precioReventa = precioReventa;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idBoleto;
        hash = 89 * hash + Objects.hashCode(this.numeroSerie);
        hash = 89 * hash + Objects.hashCode(this.fila);
        hash = 89 * hash + Objects.hashCode(this.asiento);
        hash = 89 * hash + Objects.hashCode(this.precioOriginal);
        hash = 89 * hash + Objects.hashCode(this.precioReventa);
        hash = 89 * hash + this.idEvento;
        hash = 89 * hash + this.idUsuario;
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
        final Boleto other = (Boleto) obj;
        if (this.idBoleto != other.idBoleto) {
            return false;
        }
        if (this.idEvento != other.idEvento) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (!Objects.equals(this.numeroSerie, other.numeroSerie)) {
            return false;
        }
        if (!Objects.equals(this.fila, other.fila)) {
            return false;
        }
        if (!Objects.equals(this.asiento, other.asiento)) {
            return false;
        }
        if (!Objects.equals(this.precioOriginal, other.precioOriginal)) {
            return false;
        }
        return Objects.equals(this.precioReventa, other.precioReventa);
    }
    
    
}
