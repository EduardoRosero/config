/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloBancario.Session;

import ModuloBancario.Entidades.Cuenta;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
 */
@Local
public interface manejadorCuentaLocal {

    List<Cuenta> recuperarCuentas();

    void crearCuenta(Long cuenta_id, String usuario_id, String cuenta_num, Date cuenta_fecha, BigInteger saldo);
    
}
