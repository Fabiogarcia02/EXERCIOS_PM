package Bicicleta;

public class Bicicleta {
    int marchaatual;
    int velocidade;

     public Bicicleta(int marchaatual,int velocidade){
            this.marchaatual=marchaatual;
            this.velocidade=velocidade;        
        }

   public int acelerar(int velocidadeescolhida){
            velocidade+=velocidadeescolhida;
       return velocidade;
    }

    public int frear(int velocidadeescolhida){
         if(velocidade- velocidadeescolhida<0){
             return velocidade;
         }
        velocidade-= velocidadeescolhida;

      return velocidade;
    }

    int trocarMarcha(int escolha){
        if(escolha <0 ||escolha>8){
            return marchaatual;
        }
        return marchaatual = escolha;
    }
}
