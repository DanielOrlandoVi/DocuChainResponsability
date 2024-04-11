package practica_cadenaresponsabilidad;     // Define el paquete del código
/*
  @author jorge malaver
*/
import Gerencia.gerencia;                   // Importa la clase gerencia
import Manejos_concretos.*;                 // Importa todas las clases del paquete Manejos_concretos
import javax.swing.JOptionPane;             // Importa la clase JOptionPane para mostrar cuadros de diálogo

public class Practica_cadenaResponsabilidad {   // Define la clase principal
        public static void main(String[] args) {  // Método principal del programa
        
        int op=0;                                // Inicializa una variable para almacenar la opción del usuario
        gerencia obj =new gerencia();            // Crea un objeto de la clase gerencia
        Personal obj1 = new Personal(obj);       // Crea un objeto de la clase Personal y le pasa el objeto de gerencia
        Contabilidad obj2 =new Contabilidad(obj1); // Crea un objeto de la clase Contabilidad y le pasa el objeto de Personal
        
        String opciones[] = {"CONTABILIDAD", "PERSONAL", "GERENCIA", "SALIR DE LA APLICACION"}; // Define las opciones disponibles
        
        while (true) {  // Bucle infinito hasta que el usuario decida salir

            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una gaseosa:", "Seleccion de gaseosa",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);  // Muestra un cuadro de diálogo para que el usuario elija una opción
            
            if (opcion == null || opcion.equals("SALIR DE LA APLICACION")) {  // Si el usuario elige salir o cierra el cuadro de diálogo
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");  // Muestra un mensaje de despedida
                break;  // Sale del bucle
            }
                
            switch (opcion) {  // Dependiendo de la opción elegida por el usuario
                case "CONTABILIDAD":
                    op = 1;  // Asigna el valor correspondiente a la opción
                    obj2.getManejo(op);  // Llama al método getManejo del objeto Contabilidad
                    break;
                case "PERSONAL":
                    op = 2;
                    obj2.getManejo(op);
                    break;
                case "GERENCIA":
                    op = 3;
                    obj2.getManejo(op);
                    break;
                    
                case "SALIR DE LA APLICACION":
                    System.exit(0);  // Termina la ejecución del programa
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");  // Si la opción no es válida, muestra un mensaje de error
                    return;
            }
        }
    }
}
