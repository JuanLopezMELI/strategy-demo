package org.demo.nostrategy;

/** Tenemos una aplicación de navegación que permite a los usuarios ingresar un destino.
 * La aplicación se encarga de construir la ruta más rápida y mostrarla en el mapa.
 * La aplicación es un éxito total.
 * Más usuarios quieren empezar a usar la aplicación. Así que nos tenemos que adaptar a sus medios
 * de transporte. Algunos quieren ir a pie, otros en bici, otros más en auto.
 */

public class App {

  public static void main(String[] args) {
    Navegador navegador = new Navegador();
    navegador.construirRuta("Madrid", "Barcelona", new Auto());
    navegador.construirRuta("Madrid", "Barcelona", new Bici());
    navegador.construirRuta("Madrid", "Barcelona", new Bus());
    navegador.construirRuta("Madrid", "Barcelona", new Avion());
  }
}
