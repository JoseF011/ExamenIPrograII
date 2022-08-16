
package exameniprograii;

import java.util.Scanner;


public class Clientes extends Usuarios {
    int precios;
 protected String dire;
 protected String productoDeli;
 
  
  
  public Clientes(String name, String direccion, String productoDeli, int precios){
      super (name);
      this.dire=direccion;
      this.productoDeli=productoDeli;
      this.precios=precios;
      
  }
  public void mostrarDatos(){
      System.out.println("Nombre del cliente: "+getName()+" Direccion: "+dire+  "producto final:  "+productoDeli+" Precio del producto"+precios);
  }
  
   
}
  
    
 
   
    

