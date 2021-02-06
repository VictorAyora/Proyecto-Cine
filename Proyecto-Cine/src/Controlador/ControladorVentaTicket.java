package Controlador;

import Modelo.VentaTicket;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorVentaTicket {

    private Session st;

    public ControladorVentaTicket() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarVentaTicket(VentaTicket ventaTicket) {

        try {
            st.beginTransaction();
            st.save(ventaTicket);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "VentaTicket registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<VentaTicket> cargarVentaTicket(List<VentaTicket> lis) {

        try {

            lis = (List<VentaTicket>) st.createQuery("from VentaTicket").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public VentaTicket traerVentaTicket(int id) {

        VentaTicket ventaTicket = null;

        try {
            ventaTicket = (VentaTicket) st.load(VentaTicket.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer VentaTicket");
        }
        return ventaTicket;
    }

    public void actualizarVentaTicket(VentaTicket ventaTicket) {
        try {
            st.beginTransaction();
            st.update(ventaTicket);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "VentaTicket Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar VentaTicket");
        }
    }
}
