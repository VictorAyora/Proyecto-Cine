package Controlador;

import Modelo.Snack;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorSnack {

 
    private Session st;
    Snack snack; 
    List<Snack> snacks;
    
    public Snack getSnack() {
        if(snack==null){
            snack=new Snack();
        }
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public List<Snack> getSnacks() {
        if(snacks==null){
            snacks = new ArrayList();
        }
        return snacks;
    }

    public void setSnacks(List<Snack> snacks) {
        this.snacks = snacks;
    }
    
    
    
    public ControladorSnack() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarSnack(Snack s) {

        try {
            st.beginTransaction();
            st.save(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Snack registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Snack> cargarSnack() {
        List<Snack> lis = null;
        try {

            lis = (List<Snack>) st.createQuery("from Snack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Snack traerSnack(int id) {

        Snack s = null;

        try {
            s = (Snack) st.load(Snack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Snack");
        }
        return s;
    }
    
    public Snack traeSnack(String tipo) {
        Snack snack = null;

        try {
            Query query = st.createQuery("From Snack where tipo_snack =?");
            query.setParameter(0, tipo);
            snack = (Snack) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cliente" + e);
        }
        return snack;
    }

     public Snack traeSnack(String tipo, String tamanio) {
        Snack s = null;

        try {
            Query query = st.createQuery("From Snack where tipo_snack =? and tamanio=?");
            query.setParameter(0, tipo);
            query.setParameter(1, tamanio);
            s = (Snack) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Snack" + e);
        }
        return s;
    }


    public void actualizarSnack(Snack s) {
        try {
            st.beginTransaction();
            st.update(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Snack Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar snack");
        }
    }
}
