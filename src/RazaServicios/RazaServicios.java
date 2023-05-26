/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazaServicios;

import Raza.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author emanu
 */
public class RazaServicios {

    private Scanner leer;
    private List<Raza> razas;

    public RazaServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }

    public Raza crearRaza() {

        System.out.println("Ingrese nombre de la raza");
        String nombre = leer.next();

        return new Raza(nombre);
    }

    public void agregarRaza(Raza m) {
        razas.add(m);
    }

    public void mostrarRaza() {
        System.out.println("Las razas actuales de la lista Razas son: ");
        for (Raza aux : razas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad: " + razas.size());
    }

    public void fabricaRaza() {
        Raza razaCreada = crearRaza();
        agregarRaza(razaCreada);
        for (int i = 0; i < razas.size(); i++) {
            System.out.println("Desea agregar otra raza?");
            String y = leer.next();
            if (y.equalsIgnoreCase("Si")) {
                Raza razaCreada1 = crearRaza();
                agregarRaza(razaCreada1);
            }
        }
    }

    public void actualizarRaza(int index) {
        System.out.println(" ");
        System.out.println("----------Actualizar----------");
        Raza m = crearRaza();
        razas.set(index, m);
    }

    public void eliminarRaza(int index) {
        razas.remove(index);
    }

    public void iterarRaza(String nombre) {
        Iterator<Raza> it = razas.iterator();
        while (it.hasNext()) {
            Raza m = it.next();
            if (m.getNombre().equals(nombre)) {
                it.remove();
            }
        }
    }
    
    public void removerRazaPorNombre(String nombre) {
        for (int i = 0; i < razas.size(); i++) {
            Raza m = razas.get(i);
            if (m.getNombre().equals(nombre)) {
                razas.remove(m);
            }
        }
    }

}
