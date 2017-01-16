/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Cuenta;
import java.util.ArrayList;
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
    public List<Cuenta> recuperarCuentas() {
        List<Cuenta> cnt = new ArrayList<Cuenta>();
        Query sql = em.createNamedQuery("Cliente.findAll");
        return cnt;
    }
    

}
