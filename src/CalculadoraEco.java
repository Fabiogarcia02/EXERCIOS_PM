
public class CalculadoraEco {
    static final int MES=30;//Constante em JAVA

public static double TV(int HORA){
        return (10.73 *HORA)*MES;
}
public static double Lampada(int HORA){
        return (1.11 *HORA)*MES;
}
public static double Geladadeira(int HORA){
        return (8.14 *HORA)*MES;
}
public static double Ventilador(int HORA){
        return (2.96 *HORA)*MES;
}
public static double AR(int HORA){
        return  (80.29*HORA)*MES;
}

    void main(){
       int QUANTIDADE;
       double total = 0;


       IO.println("Lista de aparelhos:1-SmartTV,2-Lampada Inteligente,3-Geladadeira Frost-Free,4-Ventilador,5-Ar-Condicionado");
       IO.println("Digite a quantodade de aparelhos que voce faz o uso:");

       QUANTIDADE= Integer.parseInt(IO.readln());
       int[] APARELHOS= new int[QUANTIDADE];
       int[] HORAS = new int[QUANTIDADE];


        for(int i=0; i<APARELHOS.length;i++){
            IO.println("Digite o aparelho  posição "+(i+1)); 
            APARELHOS[i] = Integer.parseInt(IO.readln());

        }
        for (int i = 0; i < HORAS.length; i++) {
            IO.println("Quantas horas por dia você usa o aparelho " + APARELHOS[i] + "?");
            HORAS[i] = Integer.parseInt(IO.readln());
        }
        for (int i = 0; i < APARELHOS.length; i++) {
                int aparelho = APARELHOS[i];
                int horas = HORAS[i];
                double gasto = 0;

                switch (aparelho) {
                    case 1:
                        gasto = TV(horas);
                        break;
                    case 2:
                        gasto = Lampada(horas);
                        break;
                    case 3:
                        gasto = Geladadeira(horas);
                        break;
                    case 4:
                        gasto = Ventilador(horas);
                        break;
                    case 5:
                        gasto = AR(horas);
                        break;
                    default:
                        IO.println("Aparelho inválido: " + aparelho);
                        break;
                }

                        total += gasto;
}
       IO.println("Voce consome por mes: "+total+"g"); 
    }
}
