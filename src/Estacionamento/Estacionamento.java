package Estacionamento;

public class Estacionamento {
    int vagas_totais=50;
    int vagas_ocupadas;
    
    Estacionamento(int vagas_totais){
        this.vagas_totais=vagas_totais;
    }

    int entraCarro(int qtd){
        vagas_ocupadas+=qtd;
        if(vagas_ocupadas+qtd>vagas_totais){
            return 0;
        }
        return vagas_ocupadas;
    }
      int saiCarro(int qtd){
        vagas_ocupadas-=qtd;
        if(vagas_ocupadas-qtd<vagas_totais){
            return 0;
        }
        return vagas_ocupadas;
    }

     int vagasDisponiveis(){
        return vagas_totais;
     }
}
