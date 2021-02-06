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
public class DetalleVentaSnack implements Serializable {
    private int id_detalleVentaSnack;
    public String external_id_detalleVentaSnack;
    public double precioTotal_snack;
    private double subTotal_snack;
    private double iva_snack;
    public Date fechaVenta_snack;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_detalleVentaSnack;
    }

    public void setId(int id) {
        this.id_detalleVentaSnack = id;
    }

    public String getExternal_id() {
        return external_id_detalleVentaSnack;
    }

    public void setExternal_id(String external_id) {
        this.external_id_detalleVentaSnack = external_id;
    }

    public double getPrecioTotal() {
        return precioTotal_snack;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal_snack = precioTotal;
    }

    public double getSubTotal() {
        return subTotal_snack;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal_snack = subTotal;
    }

    public double getIva() {
        return iva_snack;
    }

    public void setIva(double iva) {
        this.iva_snack = iva;
    }

    public Date getFechaVenta() {
        return fechaVenta_snack;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta_snack = fechaVenta;
    }
    
}
