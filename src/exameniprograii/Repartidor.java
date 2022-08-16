/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniprograii;

/**
 *
 * @author luisa
 */
public class Repartidor extends Usuarios {
    protected String tiempoDePedido;
    
    public Repartidor (String name, String tiempoDePedido){
        super (name);
        this.tiempoDePedido=tiempoDePedido;
        
    }
    public void setDatosRepartidor(){
        System.out.println("Nombre: "+getName()+"\nTiempo de Entrega: "+tiempoDePedido);
    }
}