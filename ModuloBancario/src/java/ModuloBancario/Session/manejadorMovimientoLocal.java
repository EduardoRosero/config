/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Movimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
 */
@Local
public interface manejadorMovimientoLocal {

    List<Movimiento> recuperarMovimientos();
    
}
