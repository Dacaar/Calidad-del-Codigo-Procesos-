/* Ejemplo de Código Espagueti*/
// Controlar que la puerta esté cerrada
import java.util.*;

public class Spaghetti{

  private int Gog;
   
public static void main(String [] args) {
  while(TRUE) {
    while (!(puerta_cerrada());
      
// Empezar con el llenado de agua
    while (!(NIVEL_AGUA_OK)) {
      if (puerta_cerrada()) {
        valvula_agua(ABRIR);
          compartimento_detergente(ABRIR);
      } else {
         valvula_agua(CERRAR);
      }
    }

    if (SELECCION_AGUA_CALIENTE) {
      while (tiempo <= TIEMPO_CALENTAMIENTO) {
        if (puerta_cerrada())
           calentador(ON);
        else
          calentador(OFF);
        ++tiempo;
      }
   }

// Empezar ciclo de lavado
  tiempo = 0;
    while (tiempo <= TIEMPO_LAVADO) {
      if (puerta_cerrada())
       ciclo_lavado(ON);
      else
       ciclo_lavado(OFF);
    ++tiempo;
   }
  }
}
}
