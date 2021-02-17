package Controlador;

import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Usuario
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorUsuario {

    //Atributos
    private Session st;
    private Usuario usuario;

    /**
     * Verificador de acceso
     *
     * @return usuario
     */
    public Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    /**
     * Verificador de acceso
     *
     * @return void
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorUsuario() {
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
     * Este método sirve para registrar un usuario en la BD
     *
     * @param u que es el usuario
     * @return void
     */
    public void registrarUsuario(Usuario u) {

        try {
            st.beginTransaction();
            st.save(u);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuario registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de usuarios de la BD
     *
     * @return lis
     */
    public List<Usuario> cargarUsuario(List<Usuario> lis) {

        try {

            lis = (List<Usuario>) st.createQuery("from Usuario").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer un usuario de la BD por su id
     *
     * @param id del usuario
     * @return u que es el usuario
     */
    public Usuario traerUsuario(int id) {

        Usuario u = null;

        try {
            u = (Usuario) st.load(Usuario.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer usuario");
        }
        return u;
    }

    /**
     * Este método sirve para actualizar un usuario de la BD
     *
     * @param u que es el usuario
     * @return void
     */
    public void actualizarUsuario(Usuario u) {
        try {
            st.beginTransaction();
            st.update(u);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuario Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario");
        }
    }
}
