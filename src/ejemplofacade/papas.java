/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofacade;

/**
 *
 * @author Home
 */
public class papas implements restaurante {

    @Override
    public void prepara() {
        System.out.println("Estamos preparando papas!!");
    }

  @Override
    public void servirPlato(restaurante r) {
        System.out.println("Se sirve el plato de papas");
    }
}
