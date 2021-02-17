package Controlador;

import Modelo.DetalleVentaTicket;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Pelicula
 *
 * @author Victor Ayora, Veronica Placencia, Geovanny Poma, Azucena Toledo
 */
public class ControladorDetalleVentaTicket {

    //Atributos
    private Session st;

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorDetalleVentaTicket() {
        sessionHibernate();
    }

    /**
     * Este método sirve para abrir la sesion de Hibernate
     *
     * @return void
     */
    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    /**
     * Este método sirve para registrar un detalleVentaTicket en la BD
     *
     * @param detalleVentaTicket
     * @return void
     */
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

    /**
     * Este método sirve para cargar el listado de detalleVentaTickets de la BD
     *
     * @return lis
     */
    public List<DetalleVentaTicket> cargarDetalleVentaTicket(List<DetalleVentaTicket> lis) {

        try {

            lis = (List<DetalleVentaTicket>) st.createQuery("from DetalleVentaTicket").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer un detalleVentaTicket de la BD por su id
     *
     * @param id del detalleVentaTicket
     * @return detalleVentaTicket
     */
    public DetalleVentaTicket traerDetalleVentaTicket(int id) {

        DetalleVentaTicket detalleVentaTicket = null;

        try {
            detalleVentaTicket = (DetalleVentaTicket) st.load(DetalleVentaTicket.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer DetalleVentaTicket");
        }
        return detalleVentaTicket;
    }

    /**
     * Este método sirve para actualizar un detalleVentaTicket de la BD 
     *
     * @param d que es el detalleVentaTicket
     * @return void
     */
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
