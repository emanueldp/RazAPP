/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razapp;

import RazaServicios.RazaServicios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emanu
 */
public class RazAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        RazaServicios servRaz = new RazaServicios();

        servRaz.fabricaRaza();
        servRaz.mostrarRaza();

//        servRaz.iterarRaza("manchita");
//        servRaz.mostrarRaza();

        servRaz.removerRazaPorNombre("gamita");
        servRaz.mostrarRaza();
        
        servRaz.actualizarRaza(1);
        servRaz.mostrarRaza();
        
        servRaz.eliminarRaza(1);
        servRaz.mostrarRaza();
        
    }

}
