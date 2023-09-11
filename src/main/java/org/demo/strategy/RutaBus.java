package org.demo.strategy;

public class RutaBus implements RutaStrategy{

  @Override
  public void construirRuta(String origen, String destino) {
    System.out.println("Ruta en bus construida exitosamente");
  }
}
