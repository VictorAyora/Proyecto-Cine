
package Controlador;

import Modelo.Horario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorHorario {
    
    private Session st;

    public ControladorHorario() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarHorario(Horario h) {

        try {
            st.beginTransaction();
            st.save(h);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Horario registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Horario> cargarHorario(List<Horario> lis) {

        try {

            lis = (List<Horario>) st.createQuery("from Horario").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Horario traerHorario(int id) {

        Horario h = null;

        try {
            h = (Horario) st.load(Horario.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer horario");
        }
        return h;
    }

    public void actualizarFuncion(Horario h) {
        try {
            st.beginTransaction();
            st.update(h);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Horario Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar horario");
        }
    }
}
