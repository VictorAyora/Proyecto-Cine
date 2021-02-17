package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class VentaSnack implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ventaSnack;
    
    @OneToMany
    List<Snack> snacks;
    
    
    public int getId_ventaSnack() {
        return id_ventaSnack;
    }

    public void setId_ventaSnack(int id_ventaSnack) {
        this.id_ventaSnack = id_ventaSnack;
    }

    public List<Snack> getSnacks() {
        if(snacks==null){
            snacks=new ArrayList();
        }
        return snacks;
    }

    public void setSnacks(List<Snack> snacks) {
        this.snacks = snacks;
    }    
}
