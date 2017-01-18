/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
 */
@Local
public interface manejadorUsuarioLocal {

    List<Usuario> recuperarUsuarios();

    void crearUsuario(Short usuario_id, String usuario_ci, String usuario_nom1, String usuario_nom2, String usuario_ape1, String usuario_ape2, String usuario_telf, String usuario_dir, String usuario_sexo, String usuario_edad, String usuario_email, String usuario_pass, Boolean usuario_tipo);
    
}
