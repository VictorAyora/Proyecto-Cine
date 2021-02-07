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
public class Rol implements Serializable {
    
    //Atributos de la clase Rol
    private int id_rol;
    private String tipo_rol; 
    
    //Getters y Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_rol;
    }

    public void setId(int id) {
        this.id_rol = id;
    }

    public String getTpo() {
        return tipo_rol;
    }

    public void setTpo(String tpo) {
        this.tipo_rol = tpo;
    }
    
}
