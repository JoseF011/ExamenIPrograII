
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
                
               Clientes =new Clientes();
                System.out.println("Ingrese su nombre: ");
                Clientes1.getNombre();
                System.out.println("Ingrese su direccion: ");
                Clientes1.getDireccion();
                break;
                
            
        }
      
    }
    
}
