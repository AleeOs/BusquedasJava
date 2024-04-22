/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1061017158
 */
public class Ejercicio2 {
    private static ArrayList <Libro> libros = new ArrayList();
    static Scanner lec = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribir el numero de libros a ingresar");
        int numeroLibros = lec.nextInt();
        
        for(int i = 0; i < numeroLibros; i++){
            System.out.println("Digite el nombre del Libro: " + (i + 1));
            double tiempoAtleta = lec.nextDouble();
            registrarTiempos(tiempoAtleta);
        }//fin for 1
        
        System.out.println("Listados de los libros sin ordenar");
        mostrarTiempos();
        
        ordenar
        
        
        
    }
    
}
