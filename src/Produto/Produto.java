package Produto;

public class Produto {
    double preco;
    String nome;
    double quantidade;
    String codigo;

     Produto(double preco, String nome, int quantidade, String codigo){
          this.preco = preco;
          this.nome = nome;
          this.quantidade = quantidade;
          this.codigo=codigo;
     }

     double adicionaEstoque(double qtd){
        if(qtd> quantidade){
            return quantidade;
        }
         quantidade+=qtd;
         return quantidade;
     }

     double removeEstoque(double qtd){
         if(qtd> quantidade){
            return quantidade;
        }
         quantidade-=qtd;
         return quantidade;
     }

     double calcularValor(){
         double resultado = quantidade * preco;
            return resultado;
     }
     
     
}
