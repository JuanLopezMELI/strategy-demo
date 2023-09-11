package org.demo.strategy;

public class Navegador {
  private RutaStrategy rutaStrategy;

  public Navegador(RutaStrategy rutaStrategy) {
    this.rutaStrategy = rutaStrategy;
  }

  public void construirRuta(String origen, String destino) {
    rutaStrategy.construirRuta(origen, destino);
  }

  public void setRutaStrategy(RutaStrategy rutaStrategy) {
    this.rutaStrategy = rutaStrategy;
  }
}
