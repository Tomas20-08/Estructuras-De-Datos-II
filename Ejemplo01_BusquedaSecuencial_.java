//Busqueda Secuaencial
 
package AlgoritmosDeBusqueda;
 
import javax.swing.JOptionPane;
 
public class Ejemplo01_BusquedaSecuencial_ {
 
    public static void main(String[] args) {
        
        //Declaración e Inicialización De Variables
        
        int arreglo[] = {9,5,7,1,3,8,2,4,6};
        int dato;
        boolean b = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
        int i = 0;
        while(i < 10 && b == false){
            if(dato == arreglo[i]){
               b = true;
            }
            i++;
        }
        if(b == false){
            JOptionPane.showMessageDialog(null,"El número no está en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null,"El número esta en la posición: " + (i-1));
        }
    }
}