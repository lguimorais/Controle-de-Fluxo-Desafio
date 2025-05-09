public class Contar extends Exception {
  public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm >= parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro\n");
    }
    int contagem = parametroDois - parametroUm;

    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
