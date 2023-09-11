package org.demo.strategy;

public class RutaAuto implements RutaStrategy {

  @Override
  public void construirRuta(String origen, String destino) {
    System.out.println("Ruta en auto construida exitosamente");
  }
}
