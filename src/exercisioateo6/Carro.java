package exercisioateo6;

public class Carro {
    String placa;
    int velocidadeMAX=120;
    int velocidadeveiculo;
    int aumentomax = velocidadeMAX-velocidadeveiculo;
    
    public int acelerar(int velocidade){
         if(velocidade+velocidadeveiculo>120){
                return velocidadeveiculo;
        }
            velocidadeveiculo+=velocidade;
        return velocidadeveiculo;
    }

    public int frear(int velocidade){
        if(velocidade-velocidadeveiculo<0){
            return velocidadeveiculo;
         }

        velocidadeveiculo-=velocidade;
      return velocidadeveiculo;  
    }

    void exibirvelocidade(){
    IO.println("A velocidade do veiculo atual:"
    +velocidadeveiculo+ "KM/H");
    }

   void Menu(){
    IO.println("Digite a placa do seu Carro:");
    placa = IO.readln();

    int opcao;

    do{
        IO.println("Opções:");
        IO.println("1 - Acelerar");
        IO.println("2 - Frear");
        IO.println("3 - Exibir velocidade");
        IO.println("4 - Sair");

        opcao = Integer.parseInt(IO.readln());

        switch(opcao){
            case 1 -> {
                IO.println("Quanto deseja acelerar?");
                int quantos = Integer.parseInt(IO.readln());
                acelerar(quantos);
            }

            case 2 -> {
                IO.println("Quanto deseja frear?");
                int quantos = Integer.parseInt(IO.readln());
                frear(quantos);
            }

            case 3 -> exibirvelocidade();

            case 4 -> IO.println("Saindo...");

            default -> IO.println("Opção inválida!");
        }

    }while(opcao != 4);
}

}
