package Controlador;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Pelicula
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorPelicula {

    //Atributos
    private Session st;
    private Pelicula pelicula;
    private List<Pelicula> peliculas;

    /**
     * Verificador de acceso
     *
     * @return pelicula
     */
    public Pelicula getPelicula() {
        if (pelicula == null) {
            pelicula = new Pelicula();
        }
        return pelicula;
    }

    /**
     * Verificador de acceso
     *
     * @param pelicula
     * @return void
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Este método sirve para listar las peliculas
     *
     * @return peliculas
     */
    public List<Pelicula> getPeliculas() {
        if (peliculas == null) {
            peliculas = new ArrayList();
        }
        return peliculas;
    }

    /**
     * Este método sirve para setear el listado de peliculas
     *
     * @param peliculas
     * @return void
     */
    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorPelicula() {
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
     * Este método sirve para registrar una pelicula en la BD
     *
     * @param p que es la pelicula
     * @return void
     */
    public void registrarPelicula(Pelicula p) {

        try {
            st.beginTransaction();
            st.save(p);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Película registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de peliculas de la BD
     *
     * @return lis
     */
    public List<Pelicula> cargarPeliculas() {
        List<Pelicula> lis = null;
        try {

            lis = (List<Pelicula>) st.createQuery("from Pelicula").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una pelicula de la BD por su id
     *
     * @param id de la pelicula
     * @return p que es la pelicula
     */
    public Pelicula traerPelicula(int id) {

        Pelicula p = null;

        try {
            p = (Pelicula) st.load(Pelicula.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar película");
        }
        return p;
    }

    /**
     * Este método sirve para traer una pelicula de la BD por su titulo y
     * director
     *
     * @param titulo de la pelicula
     * @param director de la pelicula
     * @return p que es la pelicula
     */
    public Pelicula traePelicula(String titulo, String director) {
        Pelicula p = null;

        try {
            Query query = st.createQuery("From Pelicula where titulo =? and director=?");
            query.setParameter(0, titulo);
            query.setParameter(1, director);
            p = (Pelicula) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Pelicula" + e);
        }
        return p;
    }
    
        /**
     * Este método sirve para traer una pelicula de la BD por su titulo 
     *
     * @param titulo de la pelicula
     * @return p que es la pelicula
     */
    public Pelicula traePeliculaTitulo(String titulo) {
        Pelicula p = null;

        try {
            Query query = st.createQuery("From Pelicula where titulo =?");
            query.setParameter(0, titulo);
            p = (Pelicula) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Pelicula" + e);
        }
        return p;
    }

    /**
     * Este método sirve para actualizar una pelicula de la BD 
     *
     * @param p que es la pelicula
     * @return void
     */
    public void actualizarPelicula(Pelicula p) {
        try {
            st.beginTransaction();
            st.update(p);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Pelicula Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar película");
        }
    }

}
