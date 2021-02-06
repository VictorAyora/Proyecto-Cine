package Controlador;

import Modelo.Pelicula;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorPelicula {

    private Session st;

    public ControladorPelicula() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarPelicula(Pelicula p) {

        try {
            st.beginTransaction();
            st.save(p);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Película registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Pelicula> cargarPelicula(List<Pelicula> lis) {

        try {

            lis = (List<Pelicula>) st.createQuery("from Pelicula").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Pelicula traerPelicula(int id) {

        Pelicula p = null;

        try {
            p = (Pelicula) st.load(Pelicula.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar película");
        }
        return p;
    }

    public void actualizarPelicula(Pelicula p) {
        try {
            st.beginTransaction();
            st.update(p);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Pelicula Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar película");
        }
    }

}
