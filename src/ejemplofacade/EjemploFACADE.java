/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofacade;

/**
 *
 * @author Home
 */
public class EjemploFACADE {

    private static restaurante cheefPapas;
    private static restaurante cheefZanahorias;
    private static restaurante cheefArroz;
    private static restaurante cheefEmplatado;
    
    public static void prepararPapas()
    {
        cheefPapas.prepara();
    }
    public static void prepararZanahorias()
    {
        cheefZanahorias.prepara();
    }
    public static void prepararArroz()
    {
        cheefArroz.prepara();
    }
    
    public static void servirPlato()
    {
        cheefEmplatado.servirPlato(cheefArroz);
        cheefEmplatado.servirPlato(cheefZanahorias);
        cheefEmplatado.servirPlato(cheefPapas);
    }
    
    public static void main(String[] args) {
        
        cheefPapas = new papas();
        cheefZanahorias = new zanahorias();
        cheefArroz = new arroz();
        cheefEmplatado = new servir();
        prepararPapas();
        prepararZanahorias();
        prepararArroz();
        servirPlato();
        //cheefEmplatado.servirPlato(cheefArroz.servirPlato(cheefArroz));
        //servirPlatos(cheefEmplatado);
    }
}
