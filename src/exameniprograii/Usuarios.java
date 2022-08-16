


package exameniprograii;

import java.util.Scanner; 



public abstract class Usuarios {
       
     Scanner entrada=new Scanner(System.in);
     String name;
     
     public Usuarios (String name){
         this.name=name;
     }
     public String getName(){
         return name;
     }
    
}
