//ArreglosBidimiensionales
 
package ArrayBidimensioanles;
 
import javax.swing.JOptionPane;
 
public class Ejemplo02_InicializarArreglosBidimensioanles_ {
 
    public static void main(String[] args) {
         // int matriz [][] = new int [3][3]; Forma de declarar un arreglo cuando no se conoce sus valores 
         // int matriz [][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}}; Forma de inicializar el arreglo cuando se conocen los valores y el tamaño
         int matriz [][];
         int noFila , noColumna;
         noFila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Filas"));
         noColumna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Columnas"));
        matriz = new int [noFila][noColumna];
        // El ususario Ingresa Fila y Columnas
        for (int f = 0; f < noFila; f++) {
            for (int c = 0; c < noColumna; c++) {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la posición " + f + " " + c ));
            }
        }
 
         for(int f = 0; f < matriz.length; f++){
             for(int c = 0; c < matriz.length; c++){
                 System.out.println(matriz[f][c]);
             }
         }
 
    }
}