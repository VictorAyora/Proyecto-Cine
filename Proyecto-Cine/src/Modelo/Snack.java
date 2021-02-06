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
public class Snack implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_snack;
    public String external_id_snack;  
    public String tipo_snack;
    public double precio_snack;
    public int cantidad;
    public String imagen_snack;
    public String tamanio;
    private Boolean estado_snack;

    public Snack(int id, String external_id, String tipo, double precio, int cantidad, String imagen, String tamanio, Boolean estado) {
        this.id_snack = id;
        this.external_id_snack = external_id;
        this.tipo_snack = tipo;
        this.precio_snack = precio;
        this.cantidad = cantidad;
        this.imagen_snack = imagen;
        this.tamanio = tamanio;
        this.estado_snack = estado;
    }

    public int getId() {
        return id_snack;
    }

    public void setId(int id) {
        this.id_snack = id;
    }

    public String getExternal_id() {
        return external_id_snack;
    }

    public void setExternal_id(String external_id) {
        this.external_id_snack = external_id;
    }

    public String getTipo() {
        return tipo_snack;
    }

    public void setTipo(String tipo) {
        this.tipo_snack = tipo;
    }

    public double getPrecio() {
        return precio_snack;
    }

    public void setPrecio(double precio) {
        this.precio_snack = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen_snack;
    }

    public void setImagen(String imagen) {
        this.imagen_snack = imagen;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getEstado() {
        return estado_snack;
    }

    public void setEstado(Boolean estado) {
        this.estado_snack = estado;
    }
    
    
}
