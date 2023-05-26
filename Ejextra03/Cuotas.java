/*
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota cancelada, monto total que falta por pagar, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package Ejextra03;

/**
 *
 * @author crist
 */
public class Cuotas {
    private Poliza poliza;
    private int numero;
    private double montoTotalAPagar;
    private final String[] formaDePago = {"efectivo", "transferencia", "crédito"};
    
}
