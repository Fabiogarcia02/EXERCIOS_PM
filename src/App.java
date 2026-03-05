public class App {

    public static void main(String[] args) {

        int opcao = -1;

        do {
            opcao = exibirMenuPrincipal();

            switch (opcao) {
                case 1 -> comprarPizza();
                case 0 -> IO.println("Obrigado pela prefenrência!!!");
                default -> IO.println("Opção inválida!");
            }

            pausa();

        } while (opcao != 0);
    }

  
    public static int exibirMenuPrincipal() {
        IO.println("\n===== MENU PRINCIPAL =====");
        IO.println("1 - Comprar pizza");
        IO.println("0 - Sair");
        IO.println("Escolha uma opção:");
        return Integer.parseInt(IO.readln());
    }

    public static Pizza comprarPizza() {

        Pizza p = new Pizza();

        IO.println("Descrição da pizza: ");
        p.descricao = IO.readln();   // lê String

        IO.println("Quantos ingredientes deseja adicionar? ");
        int q = Integer.parseInt(IO.readln());

        if (p.podeAlterar(q)) {
            p.adicionarIngrediente(q);
            IO.println("\nPizza montada com sucesso!\n");
        } else {
            IO.println("\nQuantidade inválida! (máx: " + p.MAXingredientes + ")");
        }

        IO.println(p.toString());

        return p;
    }

    public static void pausa() {
        IO.println("\nPressione ENTER para continuar...");
        IO.readln(); 
    }
}