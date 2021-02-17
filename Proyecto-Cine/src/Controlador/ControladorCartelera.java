
package Controlador;

import Modelo.Cartelera;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 * Clase para el Controlador de Cartelera
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class ControladorCartelera {
    
    //Atributos
    private Session st;
    private Cartelera cartelera;
    private List<Cartelera> carteleras;
    
    //getters y setters
    public Cartelera getCartelera() {
        if(cartelera==null){
            cartelera=new Cartelera();
        }
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public Session getSt() {
        return st;
    }

    public void setSt(Session st) {
        this.st = st;
    }

    public List<Cartelera> getCarteleras() {
        return carteleras;
    }

    public void setCarteleras(List<Cartelera> carteleras) {
        this.carteleras = carteleras;
    }
    
    /**
     * Este método sirve para registrar una cuenta en la BD
     *
     * @param c que es la cuenta
     * @return void
     */
    public List<Cartelera> cargarCarteleras() {
        List<Cartelera> car = null;
        try {

            car = (List<Cartelera>) st.createQuery("from Cartelera").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return car;
    }
    
    /**
     * Este método sirve para abrir la sesion de Hibernate
     *
     * @return void
     */
    public ControladorCartelera() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

    /**
     * Este método sirve para registrar cartelera en la BD
     *
     * @param c que es la configuracion
     * @return void
     */
    public void registrarCartelera(Cartelera c) {
        try {
            st.beginTransaction();
            st.save(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cartelera registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }

    }

    /**
     * Este método sirve para cargar el listado de cuentas de la BD
     *
     * @return lis
     */
    public List<Cartelera> cargarCartelera(List<Cartelera> lis) {

        try {

            lis = (List<Cartelera>) st.createQuery("from Cartelera").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    /**
     * Este método sirve para traer una Cartelera de la BD por su id
     *
     * @param id de la cuenta
     * @return c que es la cuenta
     */
    public Cartelera traerCartelera(int id) {

        Cartelera c = null;

        try {
            c = (Cartelera) st.load(Cartelera.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer cartelera");
        }
        return c;
    }

    /**
     * Este método sirve para actualizar una Cartelera de la BD
     *
     * @param c
     * @return void
     */
    public void actualizarCartelera(Cartelera c) {
        try {
            st.beginTransaction();
            st.update(c);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cartelera Actualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar cartelera");
        }
    }
}
