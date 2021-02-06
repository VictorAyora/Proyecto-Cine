package Controlador;

import Modelo.DetalleVentaSnack;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorDetalleVentaSnack {

    private Session st;

    public ControladorDetalleVentaSnack() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarDetalleVentaSnack(DetalleVentaSnack detalleVentaSnack) {

        try {
            st.beginTransaction();
            st.save(detalleVentaSnack);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "DetalleVentaSnack registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<DetalleVentaSnack> cargarDetalleVentaSnack(List<DetalleVentaSnack> lis) {

        try {
            lis = (List<DetalleVentaSnack>) st.createQuery("from DetalleVentaSnack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public DetalleVentaSnack traerDetalleVentaSnack(int id) {

        DetalleVentaSnack detalleVentaSnack = null;

        try {
            detalleVentaSnack = (DetalleVentaSnack) st.load(DetalleVentaSnack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer DetalleVentaSnack");
        }
        return detalleVentaSnack;
    }

    public void actualizarDetalleVentaSnack(DetalleVentaSnack d) {
        try {
            st.beginTransaction();
            st.update(d);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "DetalleVentaSnack Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar DetalleVentaSnack");
        }
    }
}
