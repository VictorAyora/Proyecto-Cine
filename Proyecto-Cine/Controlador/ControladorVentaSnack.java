package Controlador;

import Modelo.VentaSnack;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de VentaSnack
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorVentaSnack {

    //Atributos
    private Session st;
    VentaSnack vs;

    //Getters y Setters
    public VentaSnack getVs() {
        if(vs==null){
            vs=new VentaSnack();
        }
        return vs;
    }

    public void setVs(VentaSnack vs) {
        this.vs = vs;
    }
    
    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorVentaSnack() {
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
     * Este método sirve para registrar una ventaSnack en la BD
     *
     * @param ventaSnack
     * @return void
     */
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

    /**
     * Este método sirve para cargar el listado de ventaSnacks de la BD
     *
     * @return lis
     */
    public List<VentaSnack> cargarVentaSnack(List<VentaSnack> lis) {

        try {

            lis = (List<VentaSnack>) st.createQuery("from VentaSnack").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una ventaSnack de la BD por su id
     *
     * @param id de ventaSnack
     * @return ventaSnack
     */
    public VentaSnack traerVentaSnack(int id) {

        VentaSnack ventaSnack = null;

        try {
            ventaSnack = (VentaSnack) st.load(VentaSnack.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer VentaSnack");
        }
        return ventaSnack;
    }

    /**
     * Este método sirve para actualizar una ventaSnack de la BD
     *
     * @param ventaSnack
     * @return void
     */
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
