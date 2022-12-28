
package co.uniminuto.edu.clases;

import java.util.Scanner;


public class TarjetaDebito extends Menu {
    
   

    public TarjetaDebito() {
        this.passwordDebito = 1234;
    }
   
     @Override
    public void validacionPassword() {
        Scanner read  = new Scanner(System.in);
        for (int i = 1 ; i <= 2 ; i ++){
            
        if (this.passwordDebito == password)
        {
            System.out.println("La contraseña es correcta");
            break;
        }
         else
         {
            System.out.println("La contraseña no es correcta. Vuelva a intentar");
            System.out.println("Por favor ingrese su clave ");
            password = read.nextDouble();
         } 
                if (this.passwordDebito == password && i ==2 )
                {
                    System.out.println("Contraseña correcta");
                    break;
                }
                else if ( password != this.passwordDebito && i == 2 )
                {
                   System.out.println("tarjeta Bloqueada");
                 
                    break;
                }
           
       }
    }
        
    @Override
    public void retiro() {
        
    Scanner read = new Scanner(System.in);
      if (this.password == 1234){
        double nuevoSaldoCuentaDebito =0;
        System.out.println("Ingrese el valor a retirar: ");
        this.valorRetiro = read.nextDouble();
        
        nuevoSaldoCuentaDebito = saldoCuentaDebito - this.valorRetiro;
            
        System.out.println("El saldo de su cuenta queda en:   $"+nuevoSaldoCuentaDebito);
        System.out.println("El valor del retiro realizado es: $"+this.valorRetiro);
      }else
      {
          System.out.println("Por favor dirijase a un banco");
      }
    }
      

    @Override
    public String consultas() {
        String msg = "";
        if (this.password == 1234){
        
        
        msg ="el saldo de su cuenta actual: "+saldoCuentaDebito;
         }
        return msg;
    }

    @Override
    public void transferencias() {
        Scanner read = new Scanner(System.in);
        
        double nuevoSaldoCuentaDebito =0;
        if (this.password == 1234){
        
        System.out.println("Ingrese el valor a transferir: ");
        this.valorTransferencia = read.nextDouble();
        
        nuevoSaldoCuentaDebito = saldoCuentaDebito - this.valorTransferencia;
        
        System.out.println("El saldo de su cuenta queda en:               $"+nuevoSaldoCuentaDebito);
        System.out.println("El valor de la transferencia realizada es de: $"+this.valorTransferencia);
    } else
      {
          System.out.println("Por favor dirijase a un banco");
      }
        
    
    }

    @Override
    public double consignaciones() {
         Scanner read = new Scanner(System.in);
        
        double nuevoSaldoCuentaDebito =0;
        if (this.password == 1234){

        System.out.println("Ingrese el valor a consignar: ");
        this.valorConsignacion = read.nextDouble();
        
        nuevoSaldoCuentaDebito = saldoCuentaDebito + this.valorConsignacion;
        }else
      {
          System.out.println("Por favor dirijase a un banco");
      }
        return nuevoSaldoCuentaDebito;
        
    }

    @Override
    public void cambioClave() {
        Scanner read = new Scanner(System.in);
        double nuevaContrasena =0;
        double aux =0;
        if (this.password == 1234){
           
            System.out.println("Ingrese la nueva contraseña: ");
            nuevaContrasena = read.nextDouble();
            System.out.println("confirme de nuevo la contraseña: ");
            aux = read.nextDouble();          
            
                if(nuevaContrasena == aux && nuevaContrasena >= 1000 && nuevaContrasena <= 9999 )
                {
                System.out.println("La contraseña ha sido cambiada correctamente");
                }
            
                else
                {
                System.out.println("Error al realizar el cambio, ingrese de nuevo ");
                }
        }else
        {
          System.out.println("Por favor dirijase a un banco");
        }
   
    }
    
}
