//Crear un algoritmo utilizando lo aprendido de los Algoritmos de Ordenamiento y Busqueda
//Por lo que haremos uso de El Algoritmo de Ordenamiento: Inserción y Algoritmo De Busqueda: Binaria 

package AlgoritmosDeBusqueda;

import javax.swing.JOptionPane;

public class Ejemplo03_AlgoritmosDeBusqueda_AlgoritmosDeOrdemaniento_Bianria_Insertión_ {

    public static void main(String[] args) {
        
        //Variables Ordenamiento por Inserción
        
       String letra[];
       int pos, nElementos;
       String aux;
       String n = " ";
       
              
       //Usuario Ingrsa cantidad de letras
       
       nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos a ingresar"));
       letra = new String [nElementos];
       
        //Variables Busqueda Binaria
        int ini = 0;
        int fin = letra.length - 1;
        String dato;
        int p = 0, resultado = -1;
       
       //Usuario Ingresa Letra
        for(int i = 0; i<nElementos; i++){
          letra[i] = JOptionPane.showInputDialog("Ingrese Letra No... " + (i + 1));
       }
        
        //Dato a buscar
         dato = JOptionPane.showInputDialog("Ingrese La letra (de la lista) a buscar");
        
        
        //Insertion Sort
       for(int i = 0; i < nElementos; i++){
           pos = i;
           aux = letra[i];
           
           while((pos>0)&&(letra[pos-1].compareTo(aux)>0)){
           letra[pos] = letra[pos-1];
                   pos--;
   
           }
          letra[pos] = aux;
        }
       
        //Busqueda Binaria
       
       while(ini <= fin){
            p = (ini + fin) / 2;
            int cmp = letra[p].compareTo(dato);
            if(cmp == 0 ){
                resultado = p;
                break;
        }else if (cmp < 0){
                ini = p + 1;
                } else {
                fin = p - 1;
                }                
        }
      
       //Impresion con System.our.Println (Letras en Orden)
       for(int i=0; i<nElementos; i++){
           System.out.println("Posicion " + i + " Letra... " + letra[i]);
             }
       //Impresion con JOptionPane (Letras En Orden)
              for (int i = 0; i<nElementos; i++){
           n = n + letra[i] + " - ";
       }
       JOptionPane.showMessageDialog(null,"Las letras en orden son ... " + n);
       
         if (resultado != -1) {
           System.out.println("La Letra "+ dato +" esta en la posición: " + resultado); //Impresion con System.our.Println (Posición Número Buscado)
           JOptionPane.showMessageDialog(null, "La Letra " + dato + " está en la posición: " + resultado);  //Impresion con JOptionPane (Posición Numero Buscado)
       } else {
            System.out.println("La Letra " + dato + " no se encuentra en la lista."); //Impresion con System.our.Println (Posición Número Buscado)
           JOptionPane.showMessageDialog(null, "La Letra " + dato + " no se encuentra en la lista.");  //Impresion con JOptionPane (Posición Numero Buscado)
       }

    }
}

 
