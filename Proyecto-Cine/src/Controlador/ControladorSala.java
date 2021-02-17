package Controlador;

import Modelo.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Sala
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorSala {

    //Atributos
    private Session st;
    private Sala sala;
    private List<Sala> salas;

    /**
     * Verificador de acceso
     *
     * @return sala
     */
    public Sala getSala() {
        if (sala == null) {
            sala = new Sala();
        }
        return sala;
    }

    /**
     * Verificador de acceso
     *
     * @return void
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    /**
     * Este método sirve para listar las salas
     *
     * @return salas
     */
    public List<Sala> getSalas() {
        if (salas == null) {
            salas = new ArrayList();
        }
        return salas;
    }

    /**
     * Este método sirve para setear el listado de salas
     *
     * @param salas
     * @return void
     */
    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorSala() {
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
     * Este método sirve para registrar una sala en la BD
     *
     * @param s que es la sala
     * @return void
     */
    public void registrarSala(Sala s) {

        try {
            st.beginTransaction();
            st.save(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Sala registrado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de salas de la BD
     *
     * @return lis
     */
    public List<Sala> cargarSalas() {
        List<Sala> lis = null;
        try {

            lis = (List<Sala>) st.createQuery("from Sala").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una sala de la BD por su id
     *
     * @param id de la sala
     * @return s que es la sala
     */
    public Sala traerSala(int id) {

        Sala s = null;

        try {
            s = (Sala) st.load(Sala.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Sala");
        }
        return s;
    }

    /**
     * Este método sirve para traer una sala de la BD por su numero
     *
     * @param numeroSala de tipo int de la pelicula
     * @return sala
     */
    public Sala traeSala(int numeroSala) {
        Sala sala = null;

        try {
            Query query = st.createQuery("From Sala where numeroSala =?");
            query.setParameter(0, numeroSala);
            sala = (Sala) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cliente" + e);
        }
        return sala;
    }

    /**
     * Este método sirve para actualizar una sala de la BD
     *
     * @param s que es la sala
     * @return void
     */
    public void actualizarSala(Sala s) {
        try {
            st.beginTransaction();
            st.update(s);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Sala Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar sala");
        }
    }
}
