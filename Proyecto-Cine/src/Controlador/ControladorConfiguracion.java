package Controlador;

import Modelo.Configuracion;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorConfiguracion {

    private Session st;
    private Configuracion configuracion;

    public Configuracion getConfiguracion() {
        if(configuracion == null){
            configuracion = new Configuracion();
        }
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
    
    
    public ControladorConfiguracion() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

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
