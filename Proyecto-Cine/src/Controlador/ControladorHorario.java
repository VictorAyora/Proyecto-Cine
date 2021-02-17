package Controlador;

import Modelo.Horario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Horario
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorHorario {

    //Atributos
    private Session st;
    Horario horario;
    List<Horario> horarios;

    /**
     * Verificador de acceso
     *
     * @return pelicula
     */
    public Horario getHorario() {
        if (horario == null) {
            horario = new Horario();
        }
        return horario;
    }

    /**
     * Verificador de acceso
     *
     * @return void
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * Este método sirve para listar las horarios
     *
     * @return horarios
     */
    public List<Horario> getHorarios() {
        if (horarios == null) {
            horarios = new ArrayList();
        }
        return horarios;
    }

    /**
     * Este método sirve para setear el listado de horarios
     *
     * @param horarios
     * @return void
     */
    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorHorario() {
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
     * Este método sirve para registrar un horario en la BD
     *
     * @param h que es el horario
     * @return void
     */
    public void registrarHorario(Horario h) {

        try {
            st.beginTransaction();
            st.save(h);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Horario registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de horarios de la BD
     *
     * @return lis
     */
    public List<Horario> cargarHorario() {
        List<Horario> lis = null;
        try {

            lis = (List<Horario>) st.createQuery("from Horario").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer un horario de la BD por su id
     *
     * @param id del horario
     * @return h que es el horario
     */
    public Horario traerHorario(int id) {

        Horario h = null;

        try {
            h = (Horario) st.load(Horario.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer horario");
        }
        return h;
    }
 /**
     * Este método sirve para actualizar un horario de la BD 
     *
     * @param h que es el horario
     * @return void
     */
    public void actualizarFuncion(Horario h) {
        try {
            st.beginTransaction();
            st.update(h);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Horario Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar horario");
        }
    }
}
