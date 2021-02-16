package Controlador;

import Modelo.Sala;
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
public class ControladorSala {

    private Session st;
    private Sala sala;
    private List<Sala> salas;

    public Sala getSala() {
        if(sala==null){
            sala=new Sala();
        }
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Sala> getSalas() {
        if(salas==null){
            salas=new ArrayList();
        }
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
    
    
    
    public ControladorSala() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = NewHibernateUtil.getSessionFactory().openSession();
    }

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

    public List<Sala> cargarSalas() {
        List<Sala> lis=null;
        try {

            lis = (List<Sala>) st.createQuery("from Sala").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lis;
    }

    public Sala traerSala(int id) {

        Sala s = null;

        try {
            s = (Sala) st.load(Sala.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Sala");
        }
        return s;
    }
    
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
