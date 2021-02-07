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
import javax.persistence.OneToOne;

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

    private List<Snack> snack = new ArrayList<Snack>();
    private List<VentaSnack> ventaSnack = new ArrayList<VentaSnack>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_detalleVentaSnack() {
        return id_detalleVentaSnack;
    }

    public void setId_detalleVentaSnack(int id_detalleVentaSnack) {
        this.id_detalleVentaSnack = id_detalleVentaSnack;
    }

    public String getExternal_id_detalleVentaSnack() {
        return external_id_detalleVentaSnack;
    }

    public void setExternal_id_detalleVentaSnack(String external_id_detalleVentaSnack) {
        this.external_id_detalleVentaSnack = external_id_detalleVentaSnack;
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
   
    @OneToMany(mappedBy = "detalleVentaSnack", cascade = CascadeType.ALL)
    public List<Snack> getSnack() {
        return snack;
    }

    public void setSnack(List<Snack> snack) {
        this.snack = snack;
    }
    
    @OneToOne(mappedBy = "detalleVSnack", cascade = CascadeType.ALL)
    public List<VentaSnack> getVentaSnack() {
        return ventaSnack;
    }

    public void setVentaSnack(List<VentaSnack> ventaSnack) {
        this.ventaSnack = ventaSnack;
    }

}
