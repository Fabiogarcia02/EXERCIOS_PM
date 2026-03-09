package exercisioateo6;

public class APPlivro {

    void main() {

        Livro livro = new Livro();

        IO.println("Digite o título do livro:");
        livro.titulo = IO.readln();

        IO.println("Digite o autor:");
        livro.autor = IO.readln();

        IO.println("Digite o número de páginas:");
        livro.Npaginas = Integer.parseInt(IO.readln());

        double[] notas = null;
        int opcao;

        do{
            IO.println("\nMENU");
            IO.println("1 - Registrar avaliações");
            IO.println("2 - Calcular média das avaliações");
            IO.println("3 - Calcular tempo de leitura");
            IO.println("4 - Sair");

            opcao = Integer.parseInt(IO.readln());

            switch(opcao){

                case 1 -> {
                    IO.println("Quantas pessoas avaliaram?");
                    int n = Integer.parseInt(IO.readln());

                    notas = registrarNotas(n);
                }

                case 2 -> {
                    if(notas != null){
                        double media = livro.avaliacaoMedia(notas);
                        IO.println("Média das avaliações: " + media);
                    } else{
                        IO.println("Nenhuma avaliação registrada.");
                    }
                }

                case 3 -> {
                    IO.println("Tempo de leitura por página (minutos):");
                    double tempo = Double.parseDouble(IO.readln());

                    double total = livro.calcularTempo(tempo);
                    IO.println("Tempo total de leitura: " + total + " minutos");
                }

                case 4 -> IO.println("Saindo...");

                default -> IO.println("Opção inválida!");
            }

        }while(opcao != 4);
    }

    public static double[] registrarNotas(int quantidade){

        double[] notas = new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            IO.println("Digite a nota da pessoa " + (i+1));
            notas[i] = Double.parseDouble(IO.readln());
        }

        return notas;
    }
}