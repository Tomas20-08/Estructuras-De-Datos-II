//Algoritmo de Ordenamiento por Selection (Numeros Ordenados de menor a mayor) 

package AlgoritmosDeOrdenamiento02;

import javax.swing.JOptionPane;

public class Ejemplo01_SelectionSort_ {

    public static void main(String[] args) {
        
        int arreglo[],nElementos,pos,aux;
        String n = " ";
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elemetos a organizar"));
        arreglo = new int [nElementos];
        
         JOptionPane.showMessageDialog(null,"Digite los elementos del arreglo");

        for(int i = 0; i<nElementos; i++){
           arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
           //Metodo Por Selección
           
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
           
       //Imprimir 
       
       JOptionPane.showMessageDialog(null,"Los Numeros ordenados son:");
        
        for(int i = 0; i<nElementos; i++){
             n += arreglo[i] + " ";
        }
        JOptionPane.showMessageDialog(null,n);

    }
    
}
