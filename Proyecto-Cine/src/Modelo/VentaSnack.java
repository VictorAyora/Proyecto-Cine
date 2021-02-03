package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class VentaSnack {
    private int id;
    public String external_id;
    private ArrayList<Snack> snack = new ArrayList<>();

    public int getId() {        return id;
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

    public ArrayList<Snack> getSnack() {
        return snack;
    }

    public void setSnack(ArrayList<Snack> snack) {
        this.snack = snack;
    }


}
