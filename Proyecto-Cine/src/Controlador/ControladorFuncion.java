package Controlador;

import Modelo.Funcion;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorFuncion {

    private Session st;

    public ControladorFuncion() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarFuncion(Funcion f) {

        try {
            st.beginTransaction();
            st.save(f);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcion registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Funcion> cargarFuncion(List<Funcion> lis) {

        try {

            lis = (List<Funcion>) st.createQuery("from Funcion").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Funcion traerFuncion(int id) {

        Funcion f = null;

        try {
            f = (Funcion) st.load(Funcion.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer funcion");
        }
        return f;
    }

    public void actualizarFuncion(Funcion f) {
        try {
            st.beginTransaction();
            st.update(f);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcion Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar funcion");
        }
    }
}
