/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofacade;

/**
 *
 * @author Home
 */
public class servir implements restaurante {

//    public void servir(restaurante r)
//    {
//        System.out.println("Se sirven el plato: "+r);
//    }
    
    @Override
    public void prepara() {
        System.out.println("Se prepara el emplatado");
    }
 
    
    public void servirPlato(restaurante r)
    {
        r.servirPlato(r);
    }
}
