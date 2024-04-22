/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package busquedasjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author 1061017158
 */
public class BusquedasJava {
    
    //se crea otro public, se le asigna una lista tipo double, un nombre "tiempos" y el dato a buscar
    public static int busquedaBinaria(ArrayList<Double> tiempos, double target){
        int left=0;
        int right=tiempos.size()-1;
        while(left <=right){
            int mitad = left + (right-left)/2;
            if(tiempos.get(mitad)== target){
                return mitad;
            } //termina if
            else if (tiempos.get(mitad)< target){
            left=mitad+1;
            }// termina else if
            else {
                right=mitad-1;
            }// termina else
            
        }// termina while
        return -1; //elemento no encontrado
    }
    
    //algoritmo de ordeaminto por Insercion
    public static void ordenarAtletas(ArrayList<Double> tiempos){
        for(int i=1; i<tiempos.size(); i++){
            boolean agregado = false;
            for(int j=1; j<0 && !agregado; j--){
                double primer=tiempos.get(j);//el primer de la parte desordenada
                double segundo=tiempos.get(j-1);//el primer de la parte ordenada
                if(primer<segundo){
                    tiempos.set(j, segundo);
                    tiempos.set(j-1, primer);
                }else {
                    
                    agregado=true;
                }
                
            }
        }
        
    }
    

    public static void main(String[] args) {
        ArrayList <Double> listime = new ArrayList<>();
        listime.add(3.22);
        listime.add(3.58);
        listime.add(3.15);
        listime.add(4.10);
        listime.add(3.33);
        
        ordenarAtletas(listime);
        
        //Organiza de menor a mayor
        //Collections.sort(listime);
        double target = 3.15;
        //Le asignamos a "a" la lista listime e imprimimos
        for (Double a: listime){
            System.out.println(a);
        }
        int index = busquedaBinaria(listime, target);
        if (index != -1){
            System.out.println(" El elemento " + target + " se encuentra en la posicion " + index);
            
            
        }//termina if
        else{
            System.out.println(" El elemnto " + target + " no e encuentra en la lista ");
        }
    }
}
