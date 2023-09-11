package org.demo.strategy;

public class App {

  public static void main(String[] args) {

    RutaAuto rutaAuto = new RutaAuto();
    RutaBus rutaBus = new RutaBus();

    Navegador navegador = new Navegador(rutaAuto);
    navegador.construirRuta("Madrid", "Barcelona");

    navegador.setRutaStrategy(rutaBus);
    navegador.construirRuta("Madrid", "Barcelona");
  }
}
