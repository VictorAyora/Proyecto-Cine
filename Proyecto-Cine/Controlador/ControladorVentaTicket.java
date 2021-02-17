package Controlador;

import Modelo.VentaTicket;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de VentaSnack
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorVentaTicket {

    //Atributos
    private Session st;
    private VentaTicket vt;
    private List<VentaTicket> lvt;
    
    //Getters y Setters
    public VentaTicket getVt() {
        return vt;
    }

    public void setVt(VentaTicket vt) {
        this.vt = vt;
    }

    public List<VentaTicket> getLvt() {
        return lvt;
    }

    public void setLvt(List<VentaTicket> lvt) {
        this.lvt = lvt;
    }
    
    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorVentaTicket() {
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
     * Este método sirve para registrar una ventaTciket en la BD
     *
     * @param ventaTicket
     * @return void
     */
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

    /**
     * Este método sirve para cargar el listado de ventaTickets de la BD
     *
     * @return lis
     */
    public List<VentaTicket> cargarVentaTicket() {
        List<VentaTicket> lis = null;
        try {

            lis = (List<VentaTicket>) st.createQuery("from VentaTicket").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una ventaTicket de la BD por su id
     *
     * @param id de ventaSnack
     * @return ventaSnack
     */
    public VentaTicket traerVentaTicket(int id) {

        VentaTicket ventaTicket = null;

        try {
            ventaTicket = (VentaTicket) st.load(VentaTicket.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer VentaTicket");
        }
        return ventaTicket;
    }

    /**
     * Este método sirve para actualizar una ventaTicket de la BD
     *
     * @param ventaTicket
     * @return void
     */
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
