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

    public ArrayList<int[]> getGuardarOrdenamientos() {
        return guardarOrdenamientos;
    }

    public void setGuardarOrdenamientos(ArrayList<int[]> guardarOrdenamientos) {
        this.guardarOrdenamientos = guardarOrdenamientos;
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
                      int vecNuevo[] = vector.clone();
                      guardarOrdenamientos.add(vecNuevo);

                }

            }
        }
    }

    //METODO POR SELECCION
    public void ordenamientoPorSeleccion(int vector[]) {
    
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
        }
        
    }


    //METODO POR INSERCION
    public void ordenamientoPorInsercion(int vector[]) {
        int i, j, aux;
        for (i = 1; i < vector.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (vector[i] < vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                    i -= 1;
                }

            }
        }

    }
    
    //METODO QUICKSORT
    public void ordenamientoQuickSort(int vector[],int inicio, int end, String tipoPivote){
        int i,j, pivote, numAleatorioDelArray;
        i = inicio;
        j = end;
        
        //Se decide la posicion del pivote.
        if(tipoPivote.equalsIgnoreCase("random")){
            //Se crea un objerto de la clase Random, este se lo va a usar para 
            //el pivote aleatorio.
            Random numAleatorio = new Random();
            //Se especifica el rango de valores aptos del n[umero aleatorio.
            //Este rango esta influenciado por el tamano del array a analizar.
            numAleatorioDelArray = numAleatorio.nextInt(end-inicio+1) + inicio;
            System.out.println("numAleatorio:" + numAleatorioDelArray);
            //Aqui se guarda el pivote aleatorio.
            pivote = vector[numAleatorioDelArray];
        }else if(tipoPivote.equalsIgnoreCase("inicio")){
            pivote = vector[i];
        }else if(tipoPivote.equalsIgnoreCase("centro")){
            int posicionCentro = (inicio + end)/2;
            pivote = vector[posicionCentro];
        }else{
            pivote = vector[j];
        }
  
        do{
            while(vector[i] < pivote){
                i++;
            }
            while(vector[j] > pivote){
                j--;
            }
            if(i<=j){
                intercambiar(vector, i, j);
                i++;
                j--;
            }
        }while(i<=j);
        
        if(inicio < j){
            ordenamientoQuickSort(vector, inicio, j, tipoPivote);
        }
        
        if(i < end){
            ordenamientoQuickSort(vector, i, end, tipoPivote);
        }
        
    }
    
    static void intercambiar(int vector[], int i, int j){
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }
}