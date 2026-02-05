//ArreglosBidimiensionales
 
package ArrayBidimensioanles;
 
public class Ejemplo01_InicializarArreglosBidimensionales_ {
 
    public static void main(String[] args) {
        
         // int matriz [][] = new int [3][3]; Forma de declarar un arreglo cuando no se conoce sus valores 
         // int matriz [][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}}; Forma de inicializar el arreglo cuando se conocen los valores y el tamaño
         int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
         
         for(int i = 0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                 System.out.print(matriz[i][j]);
             }
         }
 
    }
}