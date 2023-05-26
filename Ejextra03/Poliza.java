/*
 * Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package Ejextra03;

import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author crist
 */
public class Poliza {
    private Cliente cliente = new Cliente();
    private Map<Cliente, Collection<Vehiculo>> datos = new HashMap();
    private String numeroDePoliza;
    private LocalTime fechaDeInicio;
    private LocalTime fechaDeFin;
    private int cantidadDeCuotas;
    private String formaDePago;
    private double montoTotal;
    private final String[] tipoDeCovertura = {"total", "contra terceros", "premium", "básico"}; 
    
}
