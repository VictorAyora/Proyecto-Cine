package Controlador;

import Modelo.VentaSnack;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorVentaSnack {

    private Session st;

    public ControladorVentaSnack() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarVentaSnack(VentaSnack ventaSnack) {

        try {
            st.beginTransaction();
            st.save(ventaSnack);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "VentaSnack registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<VentaSnack> cargarVentaSnack(List<VentaSnack> lis) {

        try {

            lis = (List<VentaSnack>) st.createQuery("from VentaSnack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public VentaSnack traerVentaSnack(int id) {

        VentaSnack ventaSnack = null;

        try {
            ventaSnack = (VentaSnack) st.load(VentaSnack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer VentaSnack");
        }
        return ventaSnack;
    }

    public void actualizarVentaSnack(VentaSnack ventaSnack) {
        try {
            st.beginTransaction();
            st.update(ventaSnack);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "VentaSnack Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar VentaSnack");
        }
    }
}
