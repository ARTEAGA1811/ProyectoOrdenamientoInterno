/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoordenamientointerno;

import java.util.Arrays;



/**
 *
 * @author David Arteaga (Art3-)
 */
public class ProyectoOrdenamientoInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosDeOrdenamiento misMetodos = new MetodosDeOrdenamiento();
        int vectorUno [] = {9, 7, 5, 11, 12, 20, 2, 14, 3, 10, 6};
        int vectorDos [] = {9, 7, 5, 11, 12, 20, 2, 14, 3, 10, 6};
        int vectorTres [] = {9, 7, 5, 11, 12, 20, 2, 14, 3, 10, 6};
        int vectorCuatro [] = {9, 7, 5, 11, 12, 20, 2, 14, 3, 10, 6}; 
        System.out.println("\nArray Desordenado: \n" + Arrays.toString(vectorUno));
        
        //Ordenamiento por burbuja
        misMetodos.metodoBurbuja(vectorUno);
        System.out.println("Ordenamiento Burbuja: "+ Arrays.toString(vectorUno));
        
        //Ordenamiento por Seleccion
        misMetodos.ordenamientoPorSeleccion(vectorDos);
        System.out.println("Ordenamiento por seleccion: "+ Arrays.toString(vectorDos));
        
        //Ordenamiento por Insercion
        misMetodos.ordenamientoPorInsercion(vectorTres);
        System.out.println("Ordenamiento por insercion: "+ Arrays.toString(vectorTres));
        
        //Ordenamiento por Metodo Quicksort
//        misMetodos.ordenamientoQuickSort(vectorCuatro, 0, vectorCuatro.length-1, "centro");
//        System.out.println("Ordenamiento Quicksort: "+ Arrays.toString(vectorCuatro));
//        
        
        
        
        
    }
    
    
    
    
    
      
}
    

