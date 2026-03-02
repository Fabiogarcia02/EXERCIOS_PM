public class Produto01 {
    String descricao;
    double precoCusto;  //atributos
    double margemLucro;

    
    
    //Constructor, melhor n começar por ele
    public Produto01(String desc, double precoCusto, double margemLucro){
            this.descricao = desc;
            this.precoCusto= 0.01; // 1 centavo
            this.margemLucro=0.10;  //10 por cento
            if(precoCusto>0.01){
                this.precoCusto = precoCusto; //atualizando para um valor maior 
            }
            if(margemLucro> 10&& margemLucro<= 50){
                this.margemLucro =  precoCusto* margemLucro/100;
            }

    }
     


    public double valorVenda(){
         return precoCusto+ margemLucro;
    }

   public String toString() {
    return String.join(" ", descricao, "R$:", String.valueOf(valorVenda()));
}
}
