package Interfaces;  // Define el paquete del código
/*
  @author jorge malaver
*/
public interface Manejo_principal {  // Define la interfaz Manejo_principal
    public void getManejo(int envio);  // Declara el método getManejo que debe ser implementado por las clases que implementen esta interfaz
    // Este método recibe un parámetro que identifica cuál de los departamentos debe contestar la petición
}
