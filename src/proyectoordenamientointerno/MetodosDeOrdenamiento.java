/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoordenamientointerno;

import java.util.ArrayList;
import java.util.Random;

public class MetodosDeOrdenamiento {
    
    
    private ArrayList <int[]> guardarOrdenamientos = new ArrayList<>();
    private ArrayList <String> guardarAnalisis = new ArrayList<>();

    
    //GETTER AND SETTTER
    public ArrayList<int[]> getGuardarOrdenamientos() {
        return guardarOrdenamientos;
    }

    public void setGuardarOrdenamientos(ArrayList<int[]> guardarOrdenamientos) {
        this.guardarOrdenamientos = guardarOrdenamientos;
    }

    public ArrayList<String> getGuardarAnalisis() {
        return guardarAnalisis;
    }

    public void setGuardarAnalisis(ArrayList<String> guardarAnalisis) {
        this.guardarAnalisis = guardarAnalisis;
    }
    
    
    
    

    //METODO BURBUJA
    public void metodoBurbuja(int vector[]) {
        
        //SE agrega el array a la lista.
        int vecInicio[] = vector.clone();
        guardarOrdenamientos.add(vecInicio);
        
        int i, j;

        for (i = 0; i < (vector.length - 1); i++) {

            for (j = i+1; j < (vector.length); j++) {
                if (vector[i] > vector[j]) {
                      intercambiar(vector, i, j);
                      
                      //Se guarda el nuevo cambio
                      int vecNuevo[] = vector.clone();
                      guardarOrdenamientos.add(vecNuevo);
                      
                      //Se guarda el analisis
                      String miAnalisis = vector[j] + ">" + vector[i] + ": Se realiza cambio";
                      guardarAnalisis.add(miAnalisis);

                }

            }
        }
    }

    //METODO POR SELECCION
    public void ordenamientoPorSeleccion(int vector[]) {
    
        //SE agrega el array a la lista.
        int vecInicio[] = vector.clone();
        guardarOrdenamientos.add(vecInicio);
        
        
        for(int i=0; i < vector.length; i++){
            int indice2 = i;
            int indiceSmall = i;
            int small = vector[i];
            for(int c = indice2; c < vector.length; c++ ){      
                if(small > vector[c]){
                        small = vector[c];
                        indiceSmall = c;
                }
            }
            int aux = vector[i];
            vector[i] = small;
            vector[indiceSmall] = aux;  
            
            //Se guarda el nuevo cambio
            int vecNuevo[] = vector.clone();
            guardarOrdenamientos.add(vecNuevo);

            //Se guarda el analisis
            String miAnalisis = "Minimo encontrado ("+vector[i]+") desde "+"["+i+"]";
            guardarAnalisis.add(miAnalisis);
            
            
        }
        
    }


    //METODO POR INSERCION
    public void ordenamientoPorInsercion(int vector[]) {
        
        //SE agrega el array a la lista.
        int vecInicio[] = vector.clone();
        guardarOrdenamientos.add(vecInicio);
        
        int i, j;
        for (i = 1; i < vector.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (vector[i] < vector[j]) {
                    intercambiar(vector, i, j);
                    
                    
                    
                    
                    i -= 1;
                }
                
                
            }
            //Se guarda el nuevo cambio
            int vecNuevo[] = vector.clone();
            guardarOrdenamientos.add(vecNuevo);

            //Se guarda el analisis
            String miAnalisis = vector[j] + ">" + vector[i] + ": Se realiza cambio";
            guardarAnalisis.add(miAnalisis);
            
        }

    }
    
    //METODO QUICKSORT
    public void ordenamientoQuickSort(int vector[],int inicio, int end){
        
        //SE agrega el array a la lista.
        int vecInicio[] = vector.clone();
        guardarOrdenamientos.add(vecInicio);
        
        int i,j, pivote;
        i = inicio;
        j = end;
     
        
            int posicionCentro = (inicio + end)/2;
            pivote = vector[posicionCentro];
        do{
            while(vector[i] < pivote){
                i++;
            }
            while(vector[j] > pivote){
                j--;
            }
            if(i<=j){
                intercambiar(vector, i, j);
                
                //Se realiza el intercambio
                //Se guarda el nuevo cambio
                int vecNuevo[] = vector.clone();
                guardarOrdenamientos.add(vecNuevo);
                
                i++;
                j--;
            }
        }while(i<=j);
        
        if(inicio < j){
            ordenamientoQuickSort(vector, inicio, j);
        }
        
        if(i < end){
            ordenamientoQuickSort(vector, i, end);
        }
        
    }
    
    static void intercambiar(int vector[], int i, int j){
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }
}