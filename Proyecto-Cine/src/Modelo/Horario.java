package Modelo;

import java.util.TimeZone; /** 
/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class Horario {
    //atributos
    private int id_horario;
    public String external_id_horario;
    public DateTime hora;

    //getters y setters
    public int getId() {
        return id_horario;
    }

    public void setId(int id) {
        this.id_horario = id;
    }

    public String getExternal_id() {
        return external_id_horario;
    }

    public void setExternal_id(String external_id) {
        this.external_id_horario = external_id;
    }

    public DateTime getHora() {
        return hora;
    }

    public void setHora(DateTime hora) {
        this.hora = hora;
    }
    
}
