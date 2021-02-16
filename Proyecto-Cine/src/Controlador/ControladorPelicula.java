package Controlador;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorPelicula {

    private Session st;
    private Pelicula pelicula;
    private List<Pelicula> peliculas;

    public Pelicula getPelicula() {
        if(pelicula==null){
            pelicula=new Pelicula();
        }
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Pelicula> getPeliculas() {
        if(peliculas==null){
            peliculas=new ArrayList();
        }
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    public ControladorPelicula() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

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

    public List<Pelicula> cargarPeliculas() {
        List<Pelicula> lis = null;
        try {

            lis = (List<Pelicula>) st.createQuery("from Pelicula").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Pelicula traerPelicula(int id) {

        Pelicula p = null;

        try {
            p = (Pelicula) st.load(Pelicula.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar película");
        }
        return p;
    }

    public Pelicula traePelicula(String titulo, String director) {
        Pelicula p = null;

        try {
            Query query = st.createQuery("From Pelicula where titulo =? and director=?");
            query.setParameter(0, titulo);
            query.setParameter(1, director);
            p = (Pelicula) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Snack" + e);
        }
        return p;
    }
    
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
