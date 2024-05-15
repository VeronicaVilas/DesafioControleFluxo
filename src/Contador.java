import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {

            System.out.println("Erro: Para seguir com a aplicação, o segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for(int contagem = parametroUm; contagem <= parametroDois; contagem++) {
            System.out.println("Imprimindo o número " + contagem);
        }
	}
}