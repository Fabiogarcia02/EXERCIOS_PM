package Estacionamento;

public class App {

    public static void main(String[] args) {

        Estacionamento E = new Estacionamento(10);
        int opcao;

        do {
            IO.println("Selecione a opção:");
            IO.println("0-Sair");
            IO.println("1-Estacionar carros");
            IO.println("2-Retirar carros");
            IO.println("3-Vagas disponíveis");

            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {

                case 1 -> {
                    IO.println("Digite quantos carros vão entrar:");
                    int quantos = Integer.parseInt(IO.readln());
                    E.entraCarro(quantos);
                }

                case 2 -> {
                    IO.println("Digite quantos carros vão sair:");
                    int valor = Integer.parseInt(IO.readln());
                    E.saiCarro(valor);
                }

                case 3 -> {
                    IO.println("Número de vagas disponíveis: " + E.vagasDisponiveis());
                }

                case 0 -> {
                    IO.println("Saindo do sistema...");
                }

                default -> {
                    IO.println("Opção inválida");
                }
            }

        } while (opcao != 0);
    }
}