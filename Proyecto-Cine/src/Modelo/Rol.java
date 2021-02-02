package Modelo;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class Rol {
    
    //Atributos de la clase Rol
    private int id;
    public String external_id;
    private String tpo; 
    
    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getTpo() {
        return tpo;
    }

    public void setTpo(String tpo) {
        this.tpo = tpo;
    }
    
}
