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
public class Funcion implements Serializable {
    
    private int id_funcion;
    public String external_id_funcion;
    private boolean estado_funcion;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_funcion;
    }

    public void setId(int id) {
        this.id_funcion = id;
    }

    public String getExternal_id() {
        return external_id_funcion;
    }

    public void setExternal_id(String external_id) {
        this.external_id_funcion = external_id;
    }

    public boolean isEstado() {
        return estado_funcion;
    }

    public void setEstado(boolean estado) {
        this.estado_funcion = estado;
    }
}
