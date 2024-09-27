/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIOS;

/**
 *
 * @author osval
 */
import java.util.Date;

public class EventoDTO {

    private int idEvento;
    private String nombreEvento;
    private Date fechaEvento;
    private String venue;
    private String ciudad;
    private String estado;
    private String descripcion;

    // Constructor
    public EventoDTO(int idEvento, String nombreEvento, Date fechaEvento, String venue, String ciudad, String estado, String descripcion) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.venue = venue;
        this.ciudad = ciudad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Getters y Setters
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
}
