package Controlador;

import Modelo.DetalleVentaTicket;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorDetalleVentaTicket {

    private Session st;

    public ControladorDetalleVentaTicket() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarDetalleVentaTicket(DetalleVentaTicket detalleVentaTicket) {

        try {
            st.beginTransaction();
            st.save(detalleVentaTicket);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "DetalleVentaTicket registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<DetalleVentaTicket> cargarDetalleVentaTicket(List<DetalleVentaTicket> lis) {

        try {

            lis = (List<DetalleVentaTicket>) st.createQuery("from DetalleVentaTicket").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public DetalleVentaTicket traerDetalleVentaTicket(int id) {

        DetalleVentaTicket detalleVentaTicket = null;

        try {
            detalleVentaTicket = (DetalleVentaTicket) st.load(DetalleVentaTicket.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer DetalleVentaTicket");
        }
        return detalleVentaTicket;
    }

    public void actualizarDetalleVentaTicket(DetalleVentaTicket d) {
        try {
            st.beginTransaction();
            st.update(d);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "DetalleVentaTicket Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar DetalleVentaTicket");
        }
    }
}
