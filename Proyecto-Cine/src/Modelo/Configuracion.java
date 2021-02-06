/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */

@Entity
public class Configuracion implements Serializable {
    private int id_configuracion;
    public String external_id_configuracion;
    public String fecha;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id_configuracion;
    }

    public void setId(int id) {
        this.id_configuracion = id;
    }
    @Column(length = 20)
    public String getExternal_id() {
        return external_id_configuracion;
    }
    
    public void setExternal_id(String external_id) {
        this.external_id_configuracion = external_id;
    }
    @Column(length = 20)
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
