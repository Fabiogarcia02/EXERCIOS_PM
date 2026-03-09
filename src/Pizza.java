
public class Pizza {
    // atributos
    int qtdingredientes; 
    int MAXingredientes = 8;
    String descricao;
    double precoinit = 29.0;
    double valoringrediente = 5;

    
    public double calcularvalorFinal() {
        if(qtdingredientes==0){
            return precoinit; //caso nao tenha adição
        }
        return precoinit +  (qtdingredientes * valoringrediente);
    }
            //alteração de adicao?
            
    public boolean podeAlterar(int quantos) {
        return (quantos + qtdingredientes >= 0 &&
                quantos + qtdingredientes <= MAXingredientes);
    }

    //cliente adiciona ingrediente
    public int adicionarIngrediente(int quantos) {
        if (podeAlterar(quantos)) {
            qtdingredientes += quantos;
        }
        return qtdingredientes;
    }
    
       double totalacres = qtdingredientes * valoringrediente;
    //Emite nota
    public String toString() {
        return """
       ----- NOTA DA PIZZA -----
       Descrição: %s
       Qtd. Ingredientes: %d
       Total de acréscimo: R$ %.2f
       Valor Final: R$ %.2f
       --------------------------
       """.formatted(descricao, qtdingredientes, totalacres, calcularvalorFinal());
    }

    
    //   MÉTODO COMPRAR PIZZA
    
    public static Pizza comprarPizza() {    //colocar  no app como programa principal e passar para o caderno
        

    Pizza p = new Pizza();

    IO.println("Descrição da pizza: ");
    p.descricao = IO.readln();   

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
}