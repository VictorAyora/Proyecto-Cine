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
public class Sala implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sala;
    public String external_id_sala;
    private int numeroSala;
    private Boolean disponibilidad;
    private int capacidad;

    public Sala(int id, String external_id, int numeroSala, Boolean disponibilidad, int capacidad) {
        this.id_sala = id;
        this.external_id_sala = external_id;
        this.numeroSala = numeroSala;
        this.disponibilidad = disponibilidad;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id_sala;
    }

    public void setId(int id) {
        this.id_sala = id;
    }

    public String getExternal_id() {
        return external_id_sala;
    }

    public void setExternal_id(String external_id) {
        this.external_id_sala = external_id;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
