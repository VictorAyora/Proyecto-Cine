package Controlador;

import Modelo.Configuracion;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Configuracion
 *
 * @author Victor Ayora, Veronica Placencia, Geovanny Poma, Azucena Toledo
 */
public class ControladorConfiguracion {

    //Atributos
    private Session st;
    private Configuracion configuracion;

    /**
     * Verificador de acceso
     *
     * @return configuracion
     */
    public Configuracion getConfiguracion() {
        if (configuracion == null) {
            configuracion = new Configuracion();
        }
        return configuracion;
    }

    /**
     * Verificador de acceso
     *
     * @return configuracion
     */
    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorConfiguracion() {
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
     * Este método sirve para registrar configuracion en la BD
     *
     * @param c que es la configuracion
     * @return void
     */
    public void registrarConfiguracion(Configuracion c) {

        try {
            st.beginTransaction();
            st.save(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Configuracion registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public Configuracion traerConfiguracion(int id) {

        Configuracion c = null;

        try {
            c = (Configuracion) st.load(Configuracion.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer configuracion");
        }
        return c;
    }

    /**
     * Este método sirve para traer la configracion de la BD
     *
     * @param c que es la configuracion
     * @return void
     */
    public void actualizarConfiguracion(Configuracion c) {
        try {
            st.beginTransaction();
            st.update(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Configuracion Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar configuracion");
        }
    }
}
