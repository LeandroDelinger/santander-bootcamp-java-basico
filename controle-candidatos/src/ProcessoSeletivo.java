import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Leandro", "Isabella", "Joao", "Igor", "Julia", "Agata", "Rafael", "Murilo", "Gabriella"};

        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }

    }
    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Leandro", "Isabella", "Joao", "Igor", "Julia", "Agata", "Rafael", "Murilo", "Gabriella"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 &&  candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " olicitou este valor de salário " + salarioPretendido);

            if(salarioPretendido >= salarioPretendido) {
                System.out.println("O  candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Leandro", "Isabella", "Joao", "Igor", "Julia", "Agata", "Rafael", "Murilo", "Gabriella"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean atendeu = false;
        boolean continuaTentando = !atendeu;


        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if(continuaTentando) {
                tentativas++;
            } else{
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuaTentando && tentativas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com  o candidato " + candidato + " na " + tentativas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com  o candidato " + candidato + ", numero maximo de tentativas: " + tentativas);
        }

    }

}