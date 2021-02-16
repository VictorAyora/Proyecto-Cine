package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class Snack implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_snack;
    public String tipo_snack;
    public double precio_snack;
    public String tamanio;
    private Boolean estado_snack;
    private int cantidad;
    
    public int getId_snack() {
        return id_snack;
    }

    public void setId_snack(int id_snack) {
        this.id_snack = id_snack;
    }
    
    public String getTipo_snack() {
        return tipo_snack;
    }

    public void setTipo_snack(String tipo_snack) {
        this.tipo_snack = tipo_snack;
    }

    public double getPrecio_snack() {
        return precio_snack;
    }

    public void setPrecio_snack(double precio_snack) {
        this.precio_snack = precio_snack;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getEstado_snack() {
        return estado_snack;
    }

    public void setEstado_snack(Boolean estado_snack) {
        this.estado_snack = estado_snack;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}