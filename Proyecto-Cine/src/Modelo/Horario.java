package Modelo;

import java.io.Serializable;
import java.util.Date;
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
public class Horario implements Serializable{

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_horario;
    private Date hora = new Date();
    
    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    
}
