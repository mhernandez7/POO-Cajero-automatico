
package co.uniminuto.edu.clases;

import co.uniminto.edu.Interfaz.ICajero;
import java.util.Scanner;


public abstract class Menu implements ICajero {
    
    protected double password ;
    protected double passwordDebito;
    protected double passwordCredito;
    protected double valorRetiro  ;
    protected double valorTransferencia;
    protected double valorConsignacion;

    public double getValorRetiro() {
        return valorRetiro;
    }

    public double getValorTransferencia() {
        return valorTransferencia;
    }

    public double getValorConsignacion() {
        return valorConsignacion;
    }
    
    public void solicitudPassword(){
    Scanner read = new Scanner(System.in);
      
    System.out.println("Por favor ingrese su clave ");
    this.password = read.nextDouble();
    
    }
    
}
