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
import javax.persistence.OneToMany;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class DetalleVentaTicket implements Serializable {

    private int id_detalleVentaTicket;
    public String external_id_detalleVentaTicket;
    public Date fechaVenta_ticket;
    private double subTotal_ticket;
    private double iva_ticket;
    public double precioTotal_ticket;

    private List<VentaTicket> ventaTicket = new ArrayList<VentaTicket>();
    private List<Funcion> funcion = new ArrayList<Funcion>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_detalleVentaTicket() {
        return id_detalleVentaTicket;
    }

    public void setId_detalleVentaTicket(int id_detalleVentaTicket) {
        this.id_detalleVentaTicket = id_detalleVentaTicket;
    }

    public String getExternal_id_detalleVentaTicket() {
        return external_id_detalleVentaTicket;
    }

    public void setExternal_id_detalleVentaTicket(String external_id_detalleVentaTicket) {
        this.external_id_detalleVentaTicket = external_id_detalleVentaTicket;
    }

    public Date getFechaVenta() {
        return fechaVenta_ticket;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta_ticket = fechaVenta;
    }

    public double getSubTotal() {
        return subTotal_ticket;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal_ticket = subTotal;
    }

    public double getIva() {
        return iva_ticket;
    }

    public void setIva(double iva) {
        this.iva_ticket = iva;
    }

    public double getPrecioTotal() {
        return precioTotal_ticket;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal_ticket = precioTotal;
    }

    @OneToMany(mappedBy = "detalleventaT", cascade = CascadeType.ALL)
    public List<VentaTicket> getVentaTicket() {
        return ventaTicket;
    }

    public void setPelicula(List<VentaTicket> ventaTicket) {
        this.ventaTicket = ventaTicket;
    }

    @OneToMany(mappedBy = "detalleVentaTickt", cascade = CascadeType.ALL)
    public List<Funcion> getFuncion() {
        return funcion;
    }

    public void setFuncion(List<Funcion> funcion) {
        this.funcion = funcion;
    }

}
