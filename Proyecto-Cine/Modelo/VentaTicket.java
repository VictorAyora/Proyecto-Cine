package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class VentaTicket implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ventaTicket;
    public String external_id_ventaTicket;
    private int numTicket;
    private DetalleVentaTicket detalleventaT;
    
    @ManyToOne
    private Usuario usuario;
    
    public int getId_ventaTicket() {
        return id_ventaTicket;
    }

    public void setId_ventaTicket(int id_ventaTicket) {
        this.id_ventaTicket = id_ventaTicket;
    }

    public String getExternal_id_ventaTicket() {
        return external_id_ventaTicket;
    }

    public void setExternal_id_ventaTicket(String external_id_ventaTicket) {
        this.external_id_ventaTicket = external_id_ventaTicket;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }
    
}
