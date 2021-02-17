package Controlador;

import Modelo.DetalleVentaSnack;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de DetalleVentaSnack
 *
 * @author Victor Ayora, Veronica Placencia, Geovanny Poma, Azucena Toledo
 */
public class ControladorDetalleVentaSnack {

    //Atributos
    private Session st;
    private DetalleVentaSnack dvs;

    //Getters y setters
    public DetalleVentaSnack getDvs() {
        if (dvs == null) {
            dvs = new DetalleVentaSnack();
        }
        return dvs;
    }

    public void setDvs(DetalleVentaSnack dvs) {
        this.dvs = dvs;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorDetalleVentaSnack() {
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
     * Este método sirve para registrar DetalleVentaSnack en la BD
     *
     * @param detalleVentaSnack
     * @return void
     */
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

    /**
     * Este método sirve para cargar el listado de DetalleVentaSnack de la BD
     *
     * @return lis
     */
    public List<DetalleVentaSnack> cargarDetalleVentaSnack(List<DetalleVentaSnack> lis) {

        try {
            lis = (List<DetalleVentaSnack>) st.createQuery("from DetalleVentaSnack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer un DetalleVentaSnack de la BD por su id
     *
     * @param id de DetalleVentaSnack
     * @return detalleVentaSnack
     */
    public DetalleVentaSnack traerDetalleVentaSnack(int id) {

        DetalleVentaSnack detalleVentaSnack = null;

        try {
            detalleVentaSnack = (DetalleVentaSnack) st.load(DetalleVentaSnack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer DetalleVentaSnack");
        }
        return detalleVentaSnack;
    }

    /**
     * Este método sirve para actualizar un DetalleVentaSnack de la BD
     *
     * @param d que es el detalleVentaSnack
     * @return void
     */
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
