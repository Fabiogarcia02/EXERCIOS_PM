package exercisioateo6;

public class Data {
    int DIA;
    int MES =12;
    int ANO;

     public Data(int DIA, int MES, int ANO){
        this.ANO= ANO;
        this.MES= MES;
        this.ANO= ANO;
     }

       int converterParaDias(int dia, int mes, int ano){

            int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

            int total = dia;

            for(int i = 0; i < mes-1; i++){
                total += diasMes[i];
            }

            total += ano * 365;

            return total;
        }

   int comparaData(int dia, int mes, int ano){

        int dias1 = converterParaDias(this.DIA, this.MES, this.ANO);
        int dias2 = converterParaDias(dia, mes, ano);

    return dias1 - dias2;
}

    @Override
    public String toString(){
        return"""
         %d/
         %d/
         %d       
               """.formatted(DIA,MES,ANO);
     }
}
