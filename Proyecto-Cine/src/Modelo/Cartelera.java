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
import javax.persistence.OneToMany;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class Cartelera implements Serializable {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cartelera;
    private String dias;
    
    @OneToMany
    private List<Pelicula> pelicula;
    @OneToMany
    private List<Horario> horario;
    @OneToMany
    private List<Funcion> funcion;

    public int getId_cartelera() {
        return id_cartelera;
    }

    public void setId_cartelera(int id_cartelera) {
        this.id_cartelera = id_cartelera;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    
    public List<Pelicula> getPelicula() {
        if(pelicula == null){
            pelicula = new ArrayList();
        }
        return pelicula;
    }

    public void setPelicula(List<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    public List<Horario> getHorario() {
        if(horario==null){
            horario = new ArrayList();
        }
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }

    public List<Funcion> getFuncion() {
        if(funcion==null){
            funcion=new ArrayList();
        }
        return funcion;
    }

    public void setFuncion(List<Funcion> funcion) {
        this.funcion = funcion;
    }

}
