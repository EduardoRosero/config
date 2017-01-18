/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import javax.ejb.Local;

/**
 *
 * @author eduardo
 */
@Local
public interface manejadorUsuarioLocal {

    void recuperarUsuarios();
    
}
