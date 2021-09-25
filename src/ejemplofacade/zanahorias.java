/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofacade;

/**
 *
 * @author Home
 */
public class zanahorias implements restaurante {

    @Override
    public void prepara() {
        System.out.println("Estamos preparando zanahorias!!");
    }

     
    @Override
    public void servirPlato(restaurante r) {
        System.out.println("Se sirve el plato de zanahorias");
    }
}
