/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Temporal;

/**
 * 
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */

@Entity
public class Configuracion implements Serializable {
    
    @Id
    private int id_configuracion;
    private double precio2D;
    private double precio3D;
    private double descuentoNinio;
    private double descuentoAdultoMayor;
    private Date Horario1;
    private Date Horario2;
    private Date Horario3;
    
    
    public int getId_configuracion() {
        return id_configuracion;
    }

    public void setId_configuracion(int id_configuracion) {
        this.id_configuracion = id_configuracion;
    }

    public double getPrecio2D() {
        return precio2D;
    }

    public void setPrecio2D(double precio2D) {
        this.precio2D = precio2D;
    }

    public double getPrecio3D() {
        return precio3D;
    }

    public void setPrecio3D(double precio3D) {
        this.precio3D = precio3D;
    }

    public double getDescuentoNinio() {
        return descuentoNinio;
    }

    public void setDescuentoNinio(double descuentoNinio) {
        this.descuentoNinio = descuentoNinio;
    }

    public double getDescuentoAdultoMayor() {
        return descuentoAdultoMayor;
    }

    public void setDescuentoAdultoMayor(double descuentoAdultoMayor) {
        this.descuentoAdultoMayor = descuentoAdultoMayor;
    }


    public Date getHorario1() {
        return Horario1;
    }

    public void setHorario1(Date Horario1) {
        this.Horario1 = Horario1;
    }

    public Date getHorario2() {
        return Horario2;
    }

    public void setHorario2(Date Horario2) {
        this.Horario2 = Horario2;
    }

    public Date getHorario3() {
        return Horario3;
    }

    public void setHorario3(Date Horario3) {
        this.Horario3 = Horario3;
    }
    
}
