package Gerencia;  // Define el paquete del código
/*
  @author jorge malaver
*/
import Interfaces.Manejo_principal;  // Importa la interfaz Manejo_principal
import javax.swing.JOptionPane;     // Importa la clase JOptionPane para mostrar cuadros de diálogo

public class gerencia implements Manejo_principal{  // La clase gerencia implementa la interfaz Manejo_principal
    private  final int TipoD = 3;  // Define una constante para el tipo de departamento
    
    public gerencia(){}  // Constructor de la clase
    
    @Override
    public void getManejo(int Tipo_Dpto){  // Método que implementa la interfaz Manejo_principal
        // Imprime un mensaje indicando que la petición debe ser respondida solamente por la gerencia
        JOptionPane.showMessageDialog(null, "......LA PETICION DEBE SER RESPONDIDA SOLAMENTE POR LA GERENCIA.....");
    }  // No tiene una cláusula else porque es la última clase en la cadena de responsabilidad y no puede pasar la solicitud a otro manejador
}
