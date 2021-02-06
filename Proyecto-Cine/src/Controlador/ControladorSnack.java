package Controlador;

import Modelo.Snack;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorSnack {

 
    private Session st;

    public ControladorSnack() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarSala(Snack s) {

        try {
            st.beginTransaction();
            st.save(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Snack registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Snack> cargarSala(List<Snack> lis) {

        try {

            lis = (List<Snack>) st.createQuery("from Snack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Snack traerSala(int id) {

        Snack s = null;

        try {
            s = (Snack) st.load(Snack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Snack");
        }
        return s;
    }

    public void actualizarSala(Snack s) {
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
