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
public class Cartelera implements Serializable {
    //atributos
    private int id_cartelera;
    public String external_id_cartelera;
    public String dias;
    
    //getters y setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_cartelera;
    }

    public void setId(int id) {
        this.id_cartelera = id;
    }

    public String getExternal_id() {
        return external_id_cartelera;
    }

    public void setExternal_id(String external_id) {
        this.external_id_cartelera = external_id;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
}
