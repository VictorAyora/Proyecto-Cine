package Controlador;

import Modelo.Cuenta;
import java.math.BigInteger;
import java.security.MessageDigest;
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
public class ControladorCuenta {

    private Session st;
    private Cuenta cuenta;
    private List<Cuenta> cuentas;
    
    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public List<Cuenta> getCuentas() {
        if(cuentas == null){
            cuentas = new ArrayList();
        }
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    
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

    public List<Cuenta> cargarCuentas() {

        List<Cuenta> lista = new ArrayList();
        try {
            lista = (List<Cuenta>) st.createQuery("from Cuenta").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lista;
    }

    public Cuenta traeCuenta(String usuario) {
        Cuenta cuenta = null;

        try {
            Query query = st.createQuery("From Cuenta where usuario =?");
            query.setParameter(0, usuario);
            cuenta = (Cuenta) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cliente" + e);
        }
        return cuenta;
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
    
    public String getMD5(String clave) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(clave.getBytes());
            BigInteger numero = new BigInteger(1,array);
            String encriptado = numero.toString(16);
            while(encriptado.length() < 32){
                encriptado = "0" + encriptado;
            }
            return encriptado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
