package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class DetalleVentaTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalleVentaTicket;
    public Date fechaVenta_ticket;
    private double subTotal_ticket;
    private double iva_ticket;
    public double precioTotal_ticket;

    @OneToMany
    private List<VentaTicket> ventaTicket;
     
    @ManyToOne
    private Funcion funcion;
    
    public int getId_detalleVentaTicket() {
        return id_detalleVentaTicket;
    }

    public void setId_detalleVentaTicket(int id_detalleVentaTicket) {
        this.id_detalleVentaTicket = id_detalleVentaTicket;
    }

    public Date getFechaVenta_ticket() {
        return fechaVenta_ticket;
    }

    public void setFechaVenta_ticket(Date fechaVenta_ticket) {
        this.fechaVenta_ticket = fechaVenta_ticket;
    }

    public double getSubTotal_ticket() {
        return subTotal_ticket;
    }

    public void setSubTotal_ticket(double subTotal_ticket) {
        this.subTotal_ticket = subTotal_ticket;
    }

    public double getIva_ticket() {
        return iva_ticket;
    }

    public void setIva_ticket(double iva_ticket) {
        this.iva_ticket = iva_ticket;
    }

    public double getPrecioTotal_ticket() {
        return precioTotal_ticket;
    }

    public void setPrecioTotal_ticket(double precioTotal_ticket) {
        this.precioTotal_ticket = precioTotal_ticket;
    }

    public List<VentaTicket> getVentaTicket() {
        return ventaTicket;
    }

    public void setVentaTicket(List<VentaTicket> ventaTicket) {
        this.ventaTicket = ventaTicket;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
}
