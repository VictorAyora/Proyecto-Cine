package Controlador;

import Modelo.Funcion;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Funcion
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorFuncion {

    //Atributos
    private Session st;
    private Funcion funcion;

    //Getters y setters
    public Funcion getFuncion() {
        if(funcion==null){
            funcion = new Funcion();
        }
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorFuncion() {
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
     * Este método sirve para registrar una funcion en la BD
     *
     * @param f que es la funcion
     * @return void
     */
    public void registrarFuncion(Funcion f) {

        try {
            st.beginTransaction();
            st.save(f);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcion registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de funciones de la BD
     *
     * @return lis
     */
    public List<Funcion> cargarFuncion(List<Funcion> lis) {

        try {

            lis = (List<Funcion>) st.createQuery("from Funcion").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una funcion de la BD por su id
     *
     * @param id de la funcion
     * @return f que es la funcion
     */
    public Funcion traerFuncion(int id) {

        Funcion f = null;

        try {
            f = (Funcion) st.load(Funcion.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer funcion");
        }
        return f;
    }

    /**
     * Este método sirve para actualizar una funcion en la BD 
     *
     * @param f que es la funcion
     * @return void
     */
    public void actualizarFuncion(Funcion f) {
        try {
            st.beginTransaction();
            st.update(f);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcion Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar funcion");
        }
    }
}
