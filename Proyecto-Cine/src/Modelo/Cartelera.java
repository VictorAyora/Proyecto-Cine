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
    private int id_cartelera;
    public String external_id_cartelera;
    public String dias;
    private List<Pelicula> pelicula = new ArrayList<Pelicula>();
    private List<Horario> horario = new ArrayList<Horario>();
    private List<Funcion> funcion = new ArrayList<Funcion>();

    //getters y setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_cartelera() {
        return id_cartelera;
    }

    public void setId_cartelera(int id_cartelera) {
        this.id_cartelera = id_cartelera;
    }

    @Column(length = 30)
    public String getExternal_id_cartelera() {
        return external_id_cartelera;
    }

    public void setExternal_id_cartelera(String external_id_cartelera) {
        this.external_id_cartelera = external_id_cartelera;
    }

    @Column(length = 30)
    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    @OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
    public List<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(List<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }

    @OneToMany(mappedBy = "cartel", cascade = CascadeType.ALL)
    public List<Funcion> getFuncion() {
        return funcion;
    }

    public void setFuncion(List<Funcion> funcion) {
        this.funcion = funcion;
    }
}
