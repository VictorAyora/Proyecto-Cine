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
public class Cuenta implements Serializable{
    //Atributos de la clase Usuario
    private int id_cuenta;
    public String external_id_cuenta; 
    private String usuario;
    private String clave;
    private boolean estado_cuenta;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Getters y Setters
    public int getId() {
        return id_cuenta;
    }

    public void setId(int id) {
        this.id_cuenta = id;
    }

    public String getExternal_id() {
        return external_id_cuenta;
    }

    public void setExternal_id(String external_id) {
        this.external_id_cuenta = external_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado_cuenta;
    }

    public void setEstado(boolean estado) {
        this.estado_cuenta = estado;
    }   
}