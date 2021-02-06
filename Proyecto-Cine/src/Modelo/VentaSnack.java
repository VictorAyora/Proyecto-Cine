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
public class VentaSnack implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ventaSnack;
    public String external_id_ventaSnack;
    private ArrayList<Snack> snack = new ArrayList<>();

    public int getId() {        return id_ventaSnack;
    }

    public void setId(int id) {
        this.id_ventaSnack = id;
    }

    public String getExternal_id() {
        return external_id_ventaSnack;
    }

    public void setExternal_id(String external_id) {
        this.external_id_ventaSnack = external_id;
    }

    public ArrayList<Snack> getSnack() {
        return snack;
    }

    public void setSnack(ArrayList<Snack> snack) {
        this.snack = snack;
    }


}
