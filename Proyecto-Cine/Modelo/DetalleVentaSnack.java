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
import javax.persistence.OneToOne;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class DetalleVentaSnack implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalleVentaSnack;
    private double precioTotal_snack;
    private double subTotal_snack;
    private double iva_snack;
    private Date fechaVenta_snack;
    
    @OneToOne
    private VentaSnack ventaSnack;
   
    @ManyToOne
    private Usuario usuario;
            
    public int getId_detalleVentaSnack() {
        return id_detalleVentaSnack;
    }

    public void setId_detalleVentaSnack(int id_detalleVentaSnack) {
        this.id_detalleVentaSnack = id_detalleVentaSnack;
    }

    public double getPrecioTotal_snack() {
        return precioTotal_snack;
    }

    public void setPrecioTotal_snack(double precioTotal_snack) {
        this.precioTotal_snack = precioTotal_snack;
    }

    public double getSubTotal_snack() {
        return subTotal_snack;
    }

    public void setSubTotal_snack(double subTotal_snack) {
        this.subTotal_snack = subTotal_snack;
    }

    public double getIva_snack() {
        return iva_snack;
    }

    public void setIva_snack(double iva_snack) {
        this.iva_snack = iva_snack;
    }

    public Date getFechaVenta_snack() {
        return fechaVenta_snack;
    }

    public void setFechaVenta_snack(Date fechaVenta_snack) {
        this.fechaVenta_snack = fechaVenta_snack;
    }

    public VentaSnack getVentaSnack() {
        return ventaSnack;
    }

    public void setVentaSnack(VentaSnack ventaSnack) {
        this.ventaSnack = ventaSnack;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
