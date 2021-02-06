package Controlador;

import Modelo.Cuenta;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorCuenta {

    private Session st;

    public ControladorCuenta() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    public void registrarCuenta(Cuenta c) {

        try {
            st.beginTransaction();
            st.save(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cuenta registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    public List<Cuenta> cargarCuenta(List<Cuenta> lis) {

        try {

            lis = (List<Cuenta>) st.createQuery("from Cuenta").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Cuenta traerCuenta(int id) {

        Cuenta c = null;

        try {
            c = (Cuenta) st.load(Cuenta.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cuenta");
        }
        return c;
    }

    public void actualizarCuenta(Cuenta c) {
        try {
            st.beginTransaction();
            st.update(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cuenta Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar cuenta");
        }
    }
}
