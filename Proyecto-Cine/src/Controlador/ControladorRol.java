
package Controlador;

import Modelo.Rol;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorRol {
    private Session st;
    private Rol rol;

    public Rol getRol() {
        if(rol == null){
            rol = new Rol();
        }
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public ControladorRol() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarRol(Rol r) {
        try {
            st.beginTransaction();
            st.save(r);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Rol registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }
    }

    public List<Rol> cargarRol(List<Rol> lis) {
        try {
            lis = (List<Rol>) st.createQuery("from Rol").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Rol traerRol(int id) {

        Rol r = null;

        try {
            r = (Rol) st.load(Rol.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Rol");
        }
        return r;
    }

    public Rol traeRol(String tipo) {
        Rol rol = null;

        try {
            Query query = st.createQuery("From Rol where tipo_rol =?");
            query.setParameter(0, tipo);
            rol = (Rol) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Rol" + e);
        }
        return rol;
    }
    public void actualizarRol(Rol r) {
        try {
            st.beginTransaction();
            st.update(r);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Rol Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar rol");
        }
    }
}
