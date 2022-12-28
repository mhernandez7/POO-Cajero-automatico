
package cajeroautomatico;

import co.uniminuto.edu.clases.TarjetaDebito;
import co.uniminuto.edu.clases.TarjetaCredito;
import java.util.Scanner;

/**
 *  Crear un programa que simule las transacciones de un cajero automático. Un cajero
 *  automático funciona: introduciendo la tarjeta de débito o crédito, luego la clave, si la
 *  clave es correcta se debe mostrar un menú: retiros, consultas, transferencias,
 *  consignaciones en efectivo, cambio de password, salir.
 *  Clave TarjetaDebito 1234: saldo 5000000 || Clave tarjetaCredito 4321: saldo 8000000
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int ingreso =  0;
       System.out.println("Bienvenido al cajero automatico ");
       System.out.println("Para procesos con su Tarjeta Debito marque  (1");
       System.out.println("Para procesos con su Tarjeta Credito marque (2");
       ingreso = read.nextInt();
      
       
       switch(ingreso){
            
           case 1:{
           TarjetaDebito();
           break;
           }
           case 2:{
           TarjetaCredito();
           break;
           }
           case 3:{
                System.out.println("Error vuelva a ingresar ");
                break;
           }
       }        
        
       
    }
    
    public static void TarjetaDebito(){
         Scanner read = new Scanner(System.in);
         int ingreso =0;
         
         TarjetaDebito debito = new TarjetaDebito();
         
         System.out.println("Bienvenido a consultas y procesos de su tarjeta Debito");
         System.out.println("Para retiros digite          1)");
         System.out.println("Para Consultas digite        2)");
         System.out.println("Para Transferencias digite   3)");
         System.out.println("Para Consignaciones digite   4)");
         System.out.println("Para Cambios de clave digite 5)");
         ingreso = read.nextInt();
       
           switch(ingreso){
            
           case 1:{
                debito.solicitudPassword();
                debito.validacionPassword();
                debito.retiro();
                
                break;
           }
           case 2:{
               debito.solicitudPassword();
               debito.validacionPassword();
                System.out.println(debito.consultas());
                break;
           }
           case 3:{
               debito.solicitudPassword();
               debito.validacionPassword();
               debito.transferencias(); 
               break;
                
           }
           case 4:{
                debito.solicitudPassword();
                debito.validacionPassword();
                System.out.println("Su saldo actual queda en:           $"+debito.consignaciones()); 
                System.out.println("El monto de la consignacion fue de: $"+ debito.getValorConsignacion()); 
                break;
           }
           case 5:{
               debito.solicitudPassword();
               debito.validacionPassword();
               debito.cambioClave();
               break;
           }
       }        
    }
    
    public static void TarjetaCredito(){
    
         Scanner read = new Scanner(System.in);
         int ingreso =0;
         
         TarjetaCredito credito = new TarjetaCredito();
         
         System.out.println("Bienvenido a consultas y procesos de su tarjeta Credito");
         System.out.println("Para retiros digite          1)");
         System.out.println("Para Consultas digite        2)");
         System.out.println("Para Transferencias digite   3)");
         System.out.println("Para Consignaciones digite   4)");
         System.out.println("Para Cambios de clave digite 5)");
         ingreso = read.nextInt();
       
           switch(ingreso){
            
           case 1:{
                credito.solicitudPassword();
                credito.validacionPassword();
                credito.retiro();
                
                break;
           }
           case 2:{
               credito.solicitudPassword();
               credito.validacionPassword();
                System.out.println(credito.consultas());
                break;
           }
           case 3:{
               credito.solicitudPassword();
               credito.validacionPassword();
               credito.transferencias(); 
               break;
                
           }
           case 4:{
                credito.solicitudPassword();
                credito.validacionPassword();
                System.out.println("Su saldo actual queda en:           $"+credito.consignaciones()); 
                System.out.println("El monto de la consignacion fue de: $"+ credito.getValorConsignacion()); 
                break;
           }
           case 5:{
               credito.solicitudPassword();
               credito.validacionPassword();
               credito.cambioClave();
               break;
           }
       }        
        
    }
    
}
