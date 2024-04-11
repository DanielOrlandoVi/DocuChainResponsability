package Manejos_concretos;  // Define el paquete del código
/*
  @author jorge malaver
*/
import Interfaces.Manejo_principal;  // Importa la interfaz Manejo_principal
import javax.swing.JOptionPane;     // Importa la clase JOptionPane para mostrar cuadros de diálogo

public class Personal implements Manejo_principal{  // La clase Personal implementa la interfaz Manejo_principal
    private  final int TipoD = 2;  // Define una constante para el tipo de departamento
    private Manejo_principal suceso;  // Declara una variable de la interfaz Manejo_principal
    
    public Personal(Manejo_principal s){  // Constructor de la clase que recibe un objeto de la interfaz Manejo_principal
        this.suceso =s;  // Asigna el objeto recibido a la variable suceso
    }
    
    @Override
    public void getManejo(int Tipo_Dpto){  // Método que implementa la interfaz Manejo_principal
        if(Tipo_Dpto==TipoD) {  // Si el tipo de departamento coincide con la constante definida
            JOptionPane.showMessageDialog(null, "......EL PEDIDO DEBE SER CONTESTADO POR PERSONAL.....");  // Muestra un mensaje indicando que el pedido debe ser contestado por personal
        }  
        else{
            suceso.getManejo(Tipo_Dpto);  // Si no es la responsabilidad de este objeto, pasa la solicitud al siguiente objeto en la cadena de responsabilidad
        }
    }
}
