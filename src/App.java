public class App {
    public static void main(String[] args) {
        
        int n;
        int n1;
        int soma = 0;
        double media;
        int [] opa = new int[5];

        IO.println("Digite uma quantidade de números:");
        n = Integer.parseInt(IO.readln());  

        for (int i = 0; i < n; i++) {
            IO.println("Digite o número " + (i + 1) + ":");
            n1 = Integer.parseInt(IO.readln());  //sempre converter para ler int ou outras 
            // variaveis que não são strings
            soma += n1;
            opa[i]=n1;
        }

        media = (double) soma / n;

        IO.println("Soma = " + soma);
        IO.println("Média = " + media);
    }
}
