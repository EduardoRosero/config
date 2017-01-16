/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eduardo
 */
@Stateless
public class manejadorCuenta implements manejadorCuentaLocal {
    @PersistenceContext(unitName = "ModuloBancarioPU")//insert code UserEntityManager
    private EntityManager em;//Instancia que administra todas las entidades que tengo declaradas

    public void persist(Object object) {
        em.persist(object);//Toma un objeto y se lo pasa al entity manager, el persist instruye en base a los estados al jpa que construya el sql necesario para poder hacer las operaciones en la bdd
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
