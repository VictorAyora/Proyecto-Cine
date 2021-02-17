package Controlador;

import Modelo.Rol;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Rol
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorRol {

    //Atributos
    private Session st;
    private Rol rol;

    /**
     * Verificador de acceso
     *
     * @return rol
     */
    public Rol getRol() {
        if (rol == null) {
            rol = new Rol();
        }
        return rol;
    }

    /**
     * Verificador de acceso
     *
     * @return void
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorRol() {
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
     * Este método sirve para registrar un rol en la BD
     *
     * @param r que es el rol
     * @return void
     */
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

     /**
     * Este método sirve para cargar el listado de roles de la BD
     *
     * @return lis
     */
    public List<Rol> cargarRol(List<Rol> lis) {
        try {
            lis = (List<Rol>) st.createQuery("from Rol").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer un rol de la BD por su id
     *
     * @param id del rol
     * @return r que es el rol
     */
    public Rol traerRol(int id) {

        Rol r = null;

        try {
            r = (Rol) st.load(Rol.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Rol");
        }
        return r;
    }

    /**
     * Este método sirve para traer un rol de la BD por su tipo
     *
     * @param tipo del rol
     * @return r que es el rol
     */
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
 /**
     * Este método sirve para actualizar un rol de la BD 
     *
     * @param r que es el rol
     * @return void
     */
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
