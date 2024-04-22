/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author 1061017158
 */
public class Ejercicio1 {
    
    private static ArrayList <Atleta1> atletas = new ArrayList();
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribir el numero de tiempos a ingresar");
        int numerosAIngresar = scan.nextInt();
        
        for(int i = 0; i < numerosAIngresar; i++){
            System.out.println("Digite el tiempo del Atleta: " + (i + 1));
            double tiempoAtleta = scan.nextDouble();
            registrarTiempos(tiempoAtleta);
        }//fin for 1
        
        System.out.println("La lista de los tiempos sin ordenar");
        mostrarTiempos();
        
        ordenarPorSeleccion();
        
        
        System.out.println("Lista de los tiempos ordenados");
        mostrarTiempos();
  }
    
    
    
    public static void registrarTiempos(double tiempo){
        Atleta1 nuevoTiempo = new Atleta1(tiempo);
        atletas.add(nuevoTiempo);
        
    }
     public static void mostrarTiempos (){
        for(Atleta1 a : atletas){
            System.out.println(a.getTiempo());
        }//fin for 2
    }
     public static void ordenarPorSeleccion(){
        for(int i = 0; i < atletas.size() - 1; i++){
        Atleta1 menor = atletas.get(i);
        int posMenor = i;
        for(int j = i+1; j < atletas.size(); j++){
            Atleta1 actual = atletas.get(j);
            if(actual.getTiempo()< menor.getTiempo()){
                menor = actual;
                posMenor=j;
            }
        }
        Atleta1 temp = atletas.get(i);
        atletas.set(i, menor);
        atletas.set(posMenor, temp);
        }
    }
}

