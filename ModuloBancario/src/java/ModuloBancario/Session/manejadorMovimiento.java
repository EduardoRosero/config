/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Movimiento;
import ModuloBancario.Entidades.Usuario;
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
public class manejadorMovimiento implements manejadorMovimientoLocal {
    @PersistenceContext(unitName = "ModuloBancarioPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Movimiento> recuperarMovimientos() {
        List<Movimiento> mvn = new ArrayList<Movimiento>();
        Query sql = em.createNamedQuery("Movimiento.findAll");
        return mvn;
    }
    

}
