//Parcial práctico momento 2
 
package TallerEstructurasDeDatosCorte2;
 
import javax.swing.JOptionPane;
 
public class Ejercicio01_Parcial_ {
 
    public static void main(String[] args) {
        //Declaración Arreglo Unidimensional
        String fila[] = new String [5];
        String columna[] = new String[4];
        //Declaración Arreflo Bididmensionales
        double tabla [][] = new double [5][4]; 
        for (int i = 0; i < fila.length; i++){
        fila[i] = JOptionPane.showInputDialog("Digite el nombre del estudiante #" +(i + 1));
        }
        for (int i = 0; i < columna.length; i++){
            columna[i] = JOptionPane.showInputDialog("Digite las materias");
        }
                //Se musetra la tablo unicamente con nombres de estudiantes y materias
                    System.out.print("     ");
               for (int c = 0; c < columna.length; c++) {
            System.out.print("[" + columna[c] + "]");
        }
        System.out.println();
 
               for (int f = 0; f < fila.length; f++) {
            System.out.print("[" + fila[f] + "]");
            for (int c = 0; c < columna.length; c++) {
                System.out.print("[  ] ");
            }
            System.out.println();
        }
        //El usuario Ingresa las Calificaciones
           for (int f = 0; f < 5; f++) {
             double sum = 0; 
              for (int c = 0; c < 4; c++) {
                   tabla[f][c] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para la posición " + f + " " + c ));
                   sum += tabla[f][c];
            }
                    double prom = sum / columna.length;
                    System.out.println("El promedio del estudiante " + fila[f] + " es: " + prom);
            }
            //Se musetra la tabla con Nombres de estudiantes y Materias y sus respectivas calificaciones
 
            System.out.print("        ");
               for (int c = 0; c < columna.length; c++) {
            System.out.print("[" + columna[c] + "]");
        }
        System.out.println();
 
               for (int f = 0; f < fila.length; f++) {
            System.out.print("[" + fila[f] + "]");
            for (int c = 0; c < columna.length; c++) {
                System.out.print("[" + tabla[f][c] + "]");
            }
            System.out.println();
        }
        double dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese La nota del estudiante a buscar"));
        //Busqueda secuencial
       boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (tabla[i][j] == dato) {
                    System.out.println("La nota " + dato + " pertenece a " + fila[i] + " en la materia " + columna[j]);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("La nota no está en el arreglo.");
        }
 
}
}