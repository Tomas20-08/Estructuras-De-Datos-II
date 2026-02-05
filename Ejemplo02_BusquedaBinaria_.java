//Busqueda Binaria
 
package AlgoritmosDeBusqueda;
 
import javax.swing.JOptionPane;
public class Ejemplo02_BusquedaBinaria_ {
 
    public static void main(String[] args) {
        //Declaración e inizaclización de variables
        int arreglo[] = {0,1,2,3,4,5,6,7,8,9};
        int ini = 0;
        int fin = arreglo.length;
        int dato, p = 0, resultado = 0;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
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
        //Impresión
        JOptionPane.showMessageDialog(null,"El número "+dato+" esta en la posición: " + resultado);
        
        

 
    }
}