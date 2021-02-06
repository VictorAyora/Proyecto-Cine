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
public class Usuario implements Serializable {
    
    //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    public String external_id_usuario; 
    private String nombre;
    private String apellido;
    private String correo;
    private String cedula; 
    private int telefono;
    private String foto;
    
    //Getters y Setters 
    public int getId() {
        return id_usuario;
    }

    public void setId(int id) {
        this.id_usuario = id;
    }

    public String getExternal_id() {
        return external_id_usuario;
    }

    public void setExternal_id(String external_id) {
        this.external_id_usuario = external_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }   
}