
package exameniprograii;


public class Vendedores extends Usuarios {
     protected  int code;
  
    
    public Vendedores(String name, int code){
    super(name);
    this.code=code;
    }
   public void mostrarDatosVendedor(){
   
   System.out.println("Nombre del vendedor: "+getName()+" Codigo del Vendedor: "+code);
   }  
}
 