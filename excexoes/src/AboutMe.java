import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Por favor, digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Por favor, digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Por favor, digite seu altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "m");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura, precisão ser numéricos");
        }


    }
}