package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class VentaSnack implements Serializable {
    
    private int id_ventaSnack;
    public String external_id_ventaSnack;
    private DetalleVentaSnack detalleVSnack;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_ventaSnack() {
        return id_ventaSnack;
    }

    public void setId_ventaSnack(int id_ventaSnack) {
        this.id_ventaSnack = id_ventaSnack;
    }

    public String getExternal_id_ventaSnack() {
        return external_id_ventaSnack;
    }

    public void setExternal_id_ventaSnack(String external_id_ventaSnack) {
        this.external_id_ventaSnack = external_id_ventaSnack;
    }


}
