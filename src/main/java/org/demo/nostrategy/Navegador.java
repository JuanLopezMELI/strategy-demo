package org.demo.nostrategy;

public class Navegador {

  public void construirRuta(String puntoA, String puntoB, Object vehiculo) {
    if (vehiculo instanceof Auto) {
      System.out.println("Para llegar en auto desde " + puntoA + " hasta " + puntoB + " se debe...");
    } else if (vehiculo instanceof Bici) {
      System.out.println("Para llegar en bici desde " + puntoA + " hasta " + puntoB + " deberías...");
    } else if (vehiculo instanceof Bus) {
      System.out.println("Si quieres llegar en bus desde " + puntoA + " hasta " + puntoB + " se debe...");
    } else {
      System.out.println("No se puede llegar desde " + puntoA + " hasta " + puntoB + " en " + vehiculo.getClass().getSimpleName());
    }
  }
}
