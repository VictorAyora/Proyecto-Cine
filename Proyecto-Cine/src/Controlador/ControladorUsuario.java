
package Controlador;

import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorUsuario {
    private Session st;
    private Usuario usuario;

    public Usuario getUsuario() {
        if(usuario==null){
            usuario=new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    public ControladorUsuario() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

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

    public List<Usuario> cargarUsuario(List<Usuario> lis) {

        try {

            lis = (List<Usuario>) st.createQuery("from Usuario").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Usuario traerUsuario(int id) {

        Usuario u = null;

        try {
            u = (Usuario) st.load(Usuario.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer usuario");
        }
        return u;
    }

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
