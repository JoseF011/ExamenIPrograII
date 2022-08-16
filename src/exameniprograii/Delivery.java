
package exameniprograii;

import java.util.Scanner;
public class Delivery {

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
      int opcion;
      
        System.out.println("App delivery");
        System.out.println("1. Cliente");
        System.out.println("2. Repartidor");
        System.out.println("3. Vendedores");
        System.out.println("Ingrese el numero según su usuario: ");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1: 
                
               Clientes clienteNuevo=new Clientes("Gabriel","Res Los Jícaros","Zapato burro", 2004);
                System.out.println("");
                clienteNuevo.mostrarDatos();
                break;
            case 2:
                  Vendedores vendedor = new Vendedores ("Juan", 4356);
               System.out.println("");
               vendedor.mostrarDatosVendedor();
                break;
            case 3: 
                Repartidor repartidoresDelivery = new Repartidor ("Fernando","una hora");
                System.out.println("");
                repartidoresDelivery.setDatosRepartidor();
            break;
            default: 
                System.out.print("Numero incorrecto");
                break;
        }
      
    }
    
}
