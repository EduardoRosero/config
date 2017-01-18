/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Cuenta;
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
public class manejadorUsuario implements manejadorUsuarioLocal {
    @PersistenceContext(unitName = "ModuloBancarioPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    /**
     * Método que permite realizar la consulta a la base de datos para recuperar toda la informacion de ls Usuarios y almacenarlos en una lista
     */
    public List<Usuario> recuperarUsuarios() {
        List<Usuario> usr = new ArrayList<Usuario>();
        Query sql = em.createNamedQuery("Usuario.findAll");
        return usr;
    }

    
    @Override
    
    public void crearUsuario(Short usuario_id, String usuario_ci, String usuario_nom1, String usuario_nom2, String usuario_ape1, String usuario_ape2, String usuario_telf, String usuario_dir, String usuario_sexo, String usuario_edad, String usuario_email, String usuario_pass, Boolean usuario_tipo) {
        Usuario usr = new Usuario();
        usr.setUsuarioId(usuario_id);
        usr.setUsuarioCi(usuario_ci);
        usr.setUsuarioNom1(usuario_nom1);
        usr.setUsuarioNom2(usuario_nom2);
        usr.setUsuarioApe1(usuario_ape1);
        usr.setUsuarioApe2(usuario_ape2);
        usr.setUsuarioTelf(usuario_telf);
        usr.setUsuarioDir(usuario_dir);
        usr.setUsuarioSexo(usuario_sexo);
        usr.setUsuarioEmail(usuario_email);
        usr.setUsuarioEdad(usuario_id);
        usr.setUsuarioPass(usuario_pass);
        usr.setUsuarioTipo(usuario_tipo);
    }
    
    

 

}
