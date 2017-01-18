/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Cuenta;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author eduardo
 */
@Stateless
public class manejadorCuenta implements manejadorCuentaLocal {
    @PersistenceContext(unitName = "ModuloBancarioPU")//insert code User Entity Manager
    private EntityManager em;//Instancia que administra todas las entidades que tengo declaradas

    public void persist(Object object) {
        em.persist(object);//Toma un objeto y se lo pasa al entity manager, el persist instruye en base a los estados al jpa que construya el sql necesario para poder hacer las operaciones en la bdd
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    /**
     Ejecuta el metodo, crea query nombrado, pasa por el jpa, va a la base de datos y retorna los objetos solicitados para almacenarlos en una lista
     */
    public List<Cuenta> recuperarCuentas() {
        List<Cuenta> cnt = new ArrayList<Cuenta>();
        Query sql = em.createNamedQuery("Cuenta.findAll");
        return cnt;
    }

    @Override
    public void crearCuenta(Long cuenta_id, String usuario_id, String cuenta_num, Date cuenta_fecha, BigInteger saldo) {
        Cuenta cnt = new Cuenta();
        cnt.setCuentaId(cuenta_id);
        cnt.setUsuarioId(null);
        cnt.setCuentaNum(cuenta_num);
        cnt.setCuentaFecha(cuenta_fecha);
        cnt.setSaldo(saldo);
        
    }
    
    

}
