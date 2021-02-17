package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Funcion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_funcion;
    private boolean estado_funcion;
    
    @ManyToOne
    private Sala sala;

    public int getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(int id_funcion) {
        this.id_funcion = id_funcion;
    }

    public boolean isEstado_funcion() {
        return estado_funcion;
    }

    public void setEstado_funcion(boolean estado_funcion) {
        this.estado_funcion = estado_funcion;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
    
}
