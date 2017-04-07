/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono;

import becker.robots.City;

/**
 *
 * @author Estudiante
 */
public class Bono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ciudad = new City();
        Matriz ej = new Matriz(ciudad);
        ej.Dibujar();
        ej.resolver();
        int a = ej.NumGemas();
        
        System.out.println("Numero de gemas: "+ a);
    }
    
}
