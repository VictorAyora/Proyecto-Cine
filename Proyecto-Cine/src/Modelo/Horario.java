package Modelo;

import java.util.TimeZone;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * /**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class Horario {

    //atributos
    private int id_horario;
    public String external_id_horario;
    public DateTime hora;
    
    private Cartelera cart;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getExternal_id_horario() {
        return external_id_horario;
    }

    public void setExternal_id_horario(String external_id_horario) {
        this.external_id_horario = external_id_horario;
    }

    public DateTime getHora() {
        return hora;
    }

    public void setHora(DateTime hora) {
        this.hora = hora;
    }

}
