package one.digitalinnovation.gof.strattegy;

public class ComportamentoNormal implements Comportamento {

  @Override
  public void mover() {
    System.out.println("Movendo-se normalmente...");
  }

}
