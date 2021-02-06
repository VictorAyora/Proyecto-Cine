
package Controlador;

import Modelo.Cartelera;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorCartelera {
    private Session st;

    public ControladorCartelera() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarCartelera(Cartelera c) {

        try {
            st.beginTransaction();
            st.save(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cartelera registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Cartelera> cargarCartelera(List<Cartelera> lis) {

        try {

            lis = (List<Cartelera>) st.createQuery("from Cartelera").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Cartelera traerCartelera(int id) {

        Cartelera c = null;

        try {
            c = (Cartelera) st.load(Cartelera.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer cartelera");
        }
        return c;
    }

    public void actualizarCartelera(Cartelera c) {
        try {
            st.beginTransaction();
            st.update(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cartelera Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar cartelera");
        }
    }
}
