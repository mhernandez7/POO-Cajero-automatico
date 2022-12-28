
package co.uniminto.edu.Interfaz;

public interface ICajero {
    public final double saldoCuentaDebito = 5000000;
    public final double saldoCuentaCredito = 8000000;
    void validacionPassword();
    void retiro();
    String consultas();
    void transferencias();
    double consignaciones();
    void cambioClave();
    
}
