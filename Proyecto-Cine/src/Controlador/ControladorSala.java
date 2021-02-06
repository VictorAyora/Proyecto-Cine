package Controlador;

import Modelo.Sala;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorSala {

    private Session st;

    public ControladorSala() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarSala(Sala s) {

        try {
            st.beginTransaction();
            st.save(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Sala registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Sala> cargarSala(List<Sala> lis) {

        try {

            lis = (List<Sala>) st.createQuery("from Sala").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Sala traerSala(int id) {

        Sala s = null;

        try {
            s = (Sala) st.load(Sala.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Sala");
        }
        return s;
    }

    public void actualizarSala(Sala s) {
        try {
            st.beginTransaction();
            st.update(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Sala Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar sala");
        }
    }
}
