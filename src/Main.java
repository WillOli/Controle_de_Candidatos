import java.lang.reflect.AnnotatedArrayType;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        imprimirSelecionador();

    }

    static void imprimirSelecionador() {
        String [] candidatos =  {"FELIPE", "JULIA", "WILLIAM", "ALEXIA", "JULIA", "ROBERTO", "SILVA", "MARIA", "ROBERTA"};

        System.out.println("Imprimindo a lista de candidatos informando o indice.");

        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidatos de n° " + (indice + 1) + " é " + candidatos[indice]);
        }

//        System.out.println("Forma abreveada de interação for each");
//
//        for(String candidato : candidatos) {
//            System.out.println("O candidato selecionado foi " + candidato);
//        }
    }


    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "JULIA", "WILLIAM", "ALEXIA", "JULIA", "ROBERTO", "SILVA", "MARIA", "ROBERTA"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O cadidato " + candidato + " foi selecionado para a vagar.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    /*Metodo que escolhe o salário pretendido aleatoriamente*/

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}