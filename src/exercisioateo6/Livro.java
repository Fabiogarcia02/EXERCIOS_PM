package exercisioateo6;

public class Livro {
     String titulo;
     String autor;
     int Npaginas;

     public double calcularTempo(double horas){
        double tempototal = horas * Npaginas;
       return tempototal;  
     }

     public double[] registrarNotas(int quantidade){

    double[] notas = new double[quantidade];

    for(int i = 0; i < quantidade; i++){
        IO.println("Digite a nota da pessoa " + (i+1));
        notas[i] = Double.parseDouble(IO.readln());
    }

    return notas;
}

  public double avaliacaoMedia(double[] notas){
        double soma=0;
        for(int i=0; i<notas.length;i++){
            soma+=notas[i];
        }
    return soma/notas.length;
  }
    
}
