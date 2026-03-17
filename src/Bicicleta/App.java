package Bicicleta;

public class App {

    public static void main(String[] args) {

        Bicicleta bike = new Bicicleta(1, 0);
        int opcao;

        do {
            IO.println("Selecione a opção");
            IO.println("1-Acelerar, 2-Frear, 3-Trocar de marcha, 0-Sair");

            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {

                case 1 -> {
                    IO.println("Qual valor quer acelerar?");
                    int quantidade = Integer.parseInt(IO.readln());
                    bike.acelerar(quantidade);
                }

                case 2 -> {
                    IO.println("Qual valor quer frear?");
                    int valor = Integer.parseInt(IO.readln());
                    bike.frear(valor);
                }

                case 3 -> {
                    IO.println("Qual marcha?");
                    int escolha = Integer.parseInt(IO.readln());
                    bike.trocarMarcha(escolha);
                }

                case 0 -> {
                    IO.println("Saindo do programa...");
                }

                default -> {
                    IO.println("Opção inválida");
                }
            }

        } while (opcao != 0);
    }
}