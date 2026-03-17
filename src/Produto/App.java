package Produto;

public class App {

    public static void main(String[] args) {

        Produto P= new Produto(0, "Carrinho", 0, "13dFt");
        int opcao;

        do {
            IO.println("Selecione a opção");
            IO.println("1-Adicionar estoque");
            IO.println("2-Remover estoque");
            IO.println("3-Valor total do estoque");
            IO.println("0-Sair");

            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {

                case 1 -> {
                    IO.println("Quantidade para adicionar:");
                    int q = Integer.parseInt(IO.readln());
                    P.adicionaEstoque(q);
                }

                case 2 -> {
                    IO.println("Quantidade para remover:");
                    int q = Integer.parseInt(IO.readln());
                    P.removeEstoque(q);
                }

                case 3 -> {
                    IO.println("Valor total do estoque: " + P.calcularValor());
                }

                case 0 -> {
                    IO.println("Saindo...");
                }

                default -> {
                    IO.println("Opção inválida");
                }
            }

        } while (opcao != 0);
    }
}