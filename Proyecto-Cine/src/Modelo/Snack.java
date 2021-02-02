package Modelo;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class Snack {
    
    private int id;
    public String external_id;  
    public String tipo;
    public double precio;
    public int cantidad;
    public String imagen;
    public String tamanio;
    private Boolean estado;

    public Snack(int id, String external_id, String tipo, double precio, int cantidad, String imagen, String tamanio, Boolean estado) {
        this.id = id;
        this.external_id = external_id;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
        this.tamanio = tamanio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
