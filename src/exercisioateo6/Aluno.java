package exercisioateo6;

public class Aluno {

    public double[] NotasAtvdNormal(int notaprovas){
        double [] notas = new double[notaprovas];

        for(int i = 0; i < notaprovas; i++){
            IO.println("Digite a nota da pessoa " + (i+1));
            notas[i] = Double.parseDouble(IO.readln());
        }

        return notas;
    }

    public double mediaNotas(double[] notas){
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        double media = soma / notas.length;
        return media;
    }

    public double Reavaliacao(double mediaAtual){
        IO.println("Digite a nota da reavaliação:");
        double notaReav = Double.parseDouble(IO.readln());

        double novaMedia = (mediaAtual + notaReav) / 2;

        return novaMedia;
    }   

    public String situacaoAluno(double media){

        if(media >= 7){
            return "Aprovado";
        }
        else if(media >= 5){
            return "Reavaliação";
        }
        else{
            return "Reprovado";
        }

    }
}