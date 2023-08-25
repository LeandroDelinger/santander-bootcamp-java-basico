import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o primeiro numero: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Por favor, digite o segundo numero: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parametro não pode ser menor que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if(parametroDois < parametroUm) {
            throw new ParametroInvalidoException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o numero " +  i);
            }
        }
    }
}