public class TiposVariaveis {
    public static void main(String[] args) {
        //variaveis com "final" não poderam ser alteradas depois, elas são constantes e devem ser escritas com caixa alta
        final double PI = 3.14;

        // double entende que o valor abaixo é 2,5, não 2500, o correto para representar milhares com double, é utilizar "." apenas para centavos
        double salario = 2.500;

        // exemplo de erro utilizando short e int
        short numeroShort = 1;
        int numeroInteiro = numeroShort;
        //short numeroInteiroParaShort = numeroInteiro;

        System.out.println("Hello world!");
    }
}