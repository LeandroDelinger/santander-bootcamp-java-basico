public class FormatadorCep {

    public static void main(String[] args) {
        try  {
            String cepFormatado = formatarCep("0131244");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deve conter 8 digitos");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "12345-110";
    }

}
