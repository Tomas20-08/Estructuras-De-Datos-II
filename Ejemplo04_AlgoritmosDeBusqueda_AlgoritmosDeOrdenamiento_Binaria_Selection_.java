//Crear un algoritmo utilizando lo aprendido de los Algoritmos de Ordenamiento y Busqueda
//Por lo que haremos uso de El Algoritmo de Ordenamiento: Selección y Algoritmo De Busqueda: Binaria 

package AlgoritmosDeBusqueda;

import javax.swing.JOptionPane;

public class Ejemplo04_AlgoritmosDeBusqueda_AlgoritmosDeOrdenamiento_Binaria_Selection_ {

    public static void main(String[] args) {
        
       //Declaracion de variables para Ordemaniento
       int arreglo[],nElementos,pos,aux;
       String n = " ";
      
       //Usuario ingresa cantidad de numeros
       nElementos = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de elementos a ingresar"));
       arreglo = new int [nElementos];
       
        //Declaración de Variables para Busqueda
        int fin  = arreglo.length - 1;
        int ini = 0;
        int dato, p = 0, resultado = -1;
       
       //Usuario Ingresa Numeros
       for(int i = 0; i<nElementos; i++){
           arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero... " + (i + 1)));
       }
       //Numero a Buscar
       dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número (de la lista) a buscar"));
       
       //Ordenamiento Selección
       for(int i=0; i<nElementos; i++){
            pos = i;
                    for(int j = i; j<nElementos; j++){
                        if(arreglo[j]<arreglo[pos]){
                            pos = j;
                                    }     
                    }
                    
                     aux = arreglo[i];
        arreglo [i] = arreglo[pos];
        arreglo[pos] = aux;
        }
       
       //Busqueda Binaria
       while(ini <= fin){
            p = (ini + fin) / 2;
            if(arreglo[p] == dato ){
                resultado = p;
                break;
        }else if (arreglo[p] < dato){
                ini = p + 1;
                } else {
                fin = p - 1;
                }                
        }
       
       
       //Impresion con System.our.Println (Numero en Orden)
       for(int i=0; i<nElementos; i++){
           System.out.println("Posicion " + i + " Numero... " + arreglo[i]);
             }
       
       
       //Impresión con Joptionpane (Numeros En Orden)
       for (int i = 0; i<nElementos; i++){
           n = n + arreglo[i]+" - ";
       }
       JOptionPane.showMessageDialog(null,"Los numeros en orden son ... " + n);
       
         if (resultado != -1) {
           System.out.println("El número "+ dato +" esta en la posición: " + resultado); //Impresion con System.our.Println (Posición Número Buscado)
           JOptionPane.showMessageDialog(null, "El número " + dato + " está en la posición: " + resultado);  //Impresion con JOptionPane (Posición Numero Buscado)
       } else {
            System.out.println("El número " + dato + " no se encuentra en la lista."); //Impresion con System.our.Println (Posición Número Buscado)
           JOptionPane.showMessageDialog(null, "El número " + dato + " no se encuentra en la lista.");  //Impresion con JOptionPane (Posición Numero Buscado)
       }

    }
}