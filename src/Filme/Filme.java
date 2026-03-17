package Filme;

public class Filme {

    String nome;
    int duracaoMinutos;

    double mediaAv(double[] avaliacoes) {

        double soma = 0;

        for (int i = 0; i < avaliacoes.length; i++) {
            soma += avaliacoes[i];
        }

        return soma / avaliacoes.length;
    }

    String informarDuracao() {

        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;

        return """
               %d horas
               %d minutos
               """.formatted(horas, minutos);
    }
}