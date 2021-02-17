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
 * Clase para el Controlador de Cuenta
 *
 * @author Victor Ayora, Veronica Placencia, Geovanny Poma, Azucena Toledo
 */
public class ControladorCuenta {

    //Atributos
    private Session st;
    private Cuenta cuenta;
    private List<Cuenta> cuentas;

    /**
     * Verificador de acceso
     *
     * @return pelicula
     */
    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    /**
     * Verificador de acceso
     *
     * @return void
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Este método sirve para listar las cuentas
     *
     * @return cuentas
     */
    public List<Cuenta> getCuentas() {
        if (cuentas == null) {
            cuentas = new ArrayList();
        }
        return cuentas;
    }

    /**
     * Este método sirve para setear el listado de cuentas
     *
     * @param cuentas
     * @return void
     */
    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Sirve para crear la sesion de Hibernate
     */
    public ControladorCuenta() {
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
     * Este método sirve para registrar una cuenta en la BD
     *
     * @param c que es la cuenta
     * @return void
     */
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

    /**
     * Este método sirve para cargar el listado de cuentas de la BD
     *
     * @return lista de cuentas
     */
    public List<Cuenta> cargarCuentas() {

        List<Cuenta> lista = new ArrayList();
        try {
            lista = (List<Cuenta>) st.createQuery("from Cuenta").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Datos");
        }
        return lista;
    }

    /**
     * Este método sirve para traer una cuenta de la BD de acuerdo al usuario
     *
     * @param usuario
     * @return cuenta
     */
    public Cuenta traeCuenta(String usuario) {
        Cuenta cuenta = null;

        try {
            Query query = st.createQuery("From Cuenta where usuario =?");
            query.setParameter(0, usuario);
            cuenta = (Cuenta) query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cuenta" + e);
        }
        return cuenta;
    }

    /**
     * Este método sirve para traer una cuenta de la BD por su id
     *
     * @param id de la cuenta
     * @return c que es la cuenta
     */
    public Cuenta traerCuenta(int id) {

        Cuenta c = null;

        try {
            c = (Cuenta) st.load(Cuenta.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Cuenta");
        }
        return c;
    }

    /**
     * Este método sirve para actualizar una cuenta de la BD 
     *
     * @param c que es la cuenta
     * @return void
     */
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

    /**
     * Este método sirve para encripat la clave 
     *
     * @param clave
     * @return encriptado que es la clave encriptada
     */
    public String getMD5(String clave) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(clave.getBytes());
            BigInteger numero = new BigInteger(1, array);
            String encriptado = numero.toString(16);
            while (encriptado.length() < 32) {
                encriptado = "0" + encriptado;
            }
            return encriptado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
