public class ExemploFor {
    public static void main(String[] args) {

        String alunos[] = {"Leandro", "Isabella", "Luiza", "Nivia", "Luiz", "Alessa"};

//        for (int x = 0; x < alunos.length; x ++) {
//            System.out.println("Contando alunos: " + alunos[x]);
//        }

        for (String aluno : alunos) {
            System.out.println("Contando alunos: " + aluno);
        }

    }
}