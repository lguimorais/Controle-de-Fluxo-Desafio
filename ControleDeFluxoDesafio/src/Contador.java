import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
			Scanner terminal = new Scanner(System.in);
			Contar service = new Contar();

			System.out.println("Digite o primeiro parâmetro:");
			int parametroUm = terminal.nextInt();

			System.out.println("Digite o segundo parâmetro:");
			int parametroDois = terminal.nextInt();

			try {
				service.contar(parametroUm, parametroDois);
			} catch (ParametrosInvalidosException e) {
				System.out.println(e.getMessage());
			
			}
		
	}

    
}
