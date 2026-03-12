package exercisioateo6;

public class ContaBancaria {
    String cpf;
    int n_conta;
    double valor;
    double limite =100;
    public ContaBancaria(String cpf, int n_conta, double valor) {
        this.cpf = cpf;
        this.n_conta = n_conta;
        this.valor = valor;
       
    }


    public double Sacar(double quantidade){
                valor+= limite;
                if(quantidade>valor){
                    return valor;//mensagem de erro
                }            
            valor-= quantidade;
      return valor;     
    }

   public double Depositar(double quantidade){
    if(valor <= 0){
        double descontar = limite / 100 * 3;
        quantidade -= descontar;
    }
    valor += quantidade;
    return valor;
}
    @Override
    public String toString(){
        return"""
           Cpf:%s
           Numero da Conta:%d
           Saldo:%.2f     
            """.formatted(cpf,n_conta,valor);
     }
}
