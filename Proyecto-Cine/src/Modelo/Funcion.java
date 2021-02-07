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
public class Funcion implements Serializable {
    
    private int id_funcion;
    public String external_id_funcion;
    private boolean estado_funcion;
    private List<Sala> sala =new ArrayList<Sala>();
    private Cartelera cartel;
    private DetalleVentaTicket detalleVentaTickt;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(int id_funcion) {
        this.id_funcion = id_funcion;
    }

    @Column(length = 30)
    public String getExternal_id_funcion() {
        return external_id_funcion;
    }

    public void setExternal_id_funcion(String external_id_funcion) {
        this.external_id_funcion = external_id_funcion;
    }

    public boolean isEstado_funcion() {
        return estado_funcion;
    }

    public void setEstado_funcion(boolean estado_funcion) {
        this.estado_funcion = estado_funcion;
    }

    @OneToMany(mappedBy = "funcio", cascade = CascadeType.ALL)
    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }
}
