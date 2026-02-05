
package AlgoritmosDeOrdenamiento02;
 
import javax.swing.JOptionPane;
 
public class Ejemplo04_Ejercicio01_ProductosPrecio_ {
 
    public static void main(String[] args) {
        //Declaración De Variable
        double []arregloPrecios = new double[5];        
        String []arregloProductos = new String [5];
        double aux;
        String auxi;
        int pos;
        //Usuario ingresa nombre y precio de productos (5)
        for (int i = 0; i < 5; i++){
            arregloProductos[i] = JOptionPane.showInputDialog("Ingrese nombre producto No. " + (i + 1));

        }
        for(int i = 0; i < 5; i++){ 
            arregloPrecios[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del Producto No. "+ (i + 1)));
        }
 
        //Bubble Sort 
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                if (arregloPrecios[j] > arregloPrecios[j+1]){
                    aux = arregloPrecios[j];
                    arregloPrecios[j] = arregloPrecios[j+1];
                    arregloPrecios[j+1] = aux;
                }     
            }
        }
        //Insertion Sort
        for(int i = 0; i < 5; i++){
            pos = i;
            auxi = arregloProductos[i];
            while((pos>0)&&(arregloProductos[pos-1].compareTo(auxi)>0)){
                arregloProductos[pos] = arregloProductos[pos-1];
                pos--;     
            }
            arregloProductos[pos] = auxi;
        }
        //Impresión Scanner
        for(int i = 0; i < 5; i++){
            System.out.println("Producto No. "+(i+1)+": "+(arregloProductos[i]));
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Precio No. "+(i+1) +": " +(arregloPrecios[i]));
        }
            System.out.println("El Producto con el Mayor Precio es: ");
            System.out.println(arregloProductos[4]);
            System.out.println("Valor: " + arregloPrecios[4]);
            System.out.println(" ");
            System.out.println("El producto con el Menor Precio es:");
            System.out.println(arregloProductos[0]);
            System.out.println("Valor: " + arregloPrecios[0]);
        }
        }
