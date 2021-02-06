package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class VentaTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ventaTicket;
    public String external_id_ventaTicket;
    private int numTicket;

    public int getId() {
        return id_ventaTicket;
    }

    public void setId(int id) {
        this.id_ventaTicket = id;
    }

    public String getExternal_id() {
        return external_id_ventaTicket;
    }

    public void setExternal_id(String external_id) {
        this.external_id_ventaTicket = external_id;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }
    
}
