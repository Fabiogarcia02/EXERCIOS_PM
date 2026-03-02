public class App {
    
    public static void main(String[] args) {
        double preco =0;
        double margem=0;
         
        do{
            IO.println("Preco de custo:");
            preco = Integer.parseInt(IO.readln());
             IO.println("Margem de Lucro entre 10 e 50:");
              margem= Integer.parseInt(IO.readln());

        }while(preco< 0&& margem < 10 ||margem > 50);
        
        Produto01 meuProduto = new Produto01("Livro", preco, margem);
        IO.print(meuProduto);
    }
}
