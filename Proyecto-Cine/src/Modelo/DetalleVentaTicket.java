package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class DetalleVentaTicket implements Serializable{
    
    private int id_detalleVentaTicket;
    public String external_id_detalleVentaTicket;
    public Date fechaVenta_ticket;
    private double subTotal_ticket;
    private double iva_ticket;
    public double precioTotal_ticket;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_detalleVentaTicket;
    }

    public void setId(int id) {
        this.id_detalleVentaTicket = id;
    }

    public String getExternal_id() {
        return external_id_detalleVentaTicket;
    }

    public void setExternal_id(String external_id) {
        this.external_id_detalleVentaTicket = external_id;
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
    
}
