
package exameniprograii;



public class Producto {
 
   String producto;
   int price;
   
   public Producto (String producto, int price){
       this.producto=producto;
       this.price=price;
   }
   public String getProducto (){
       return producto;
   }
   public int getPrice(){
       return price;
   }
    
}
