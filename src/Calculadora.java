public class Calculadora {
     
    public static double Adicionar(double n1, double n2) {
        return n1+ n2;
    }
    public static double Subtrair(double n1, double n2){
        return n1-n2;
    }
    public static double Multiplicar(double n1, double n2){
        return  n1*n2;
    }
    public static double Dividir(double n1, double n2){
        return n1/n2;
    }
        void main(){
            double n1, n2;
            int opcao=1;
            
            IO.println("Digite o numero 1");
            n1 = Double.parseDouble(IO.readln());

            IO.println("Digite o numero 2");
            n2 = Double.parseDouble(IO.readln());
            

            switch (opcao) {
                case 1:
                        IO.println("Soma:"+ Adicionar(n1, n2));
                    break;
                case 2:
                        IO.println("Subtrair:"+ Subtrair(n1, n2));
                    break;
                case 3:
                        IO.println("Multiplicar:"+ Multiplicar(n1, n2));
                    break;
                case 4:
                        IO.println("Dividir:"+ Dividir(n1, n2));
                    break;         
            
                default:
                         IO.println("Soma:");
                    break;
            }
                            
             
            
          

        }
}
