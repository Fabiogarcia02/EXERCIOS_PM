public class Hora {
    private int horas;
    private int  minutos;
    private int segundos;

    public Hora(int hora, int minuto, int segundo){
        horas = hora;
        minutos= minuto;
        segundos=segundo;
        if(!horarioEhValido()){
             horas=minutos = segundos =0;
        }

    }

    public String toString() {
        return """
           Horas: %02d
           Minutos: %02d
           Segundos: %02d
           """.formatted(horas, minutos, segundos);
    }

    public boolean horarioEhValido() {
    if (horas < 0 || horas > 23 ||
        minutos < 0 || minutos > 59 ||
        segundos < 0 || segundos > 59) {
        return false;
    }
    return true;
}
     
 
 
    void converterMinutos() {
        int horasSobrando = this.minutos / 60;
        int minutosRestantes = this.minutos % 60;

        this.horas += horasSobrando;
        this.minutos = minutosRestantes;
    }

    public Hora incrementar(int qntosMinutos) {
    Hora novaHora = new Hora(this.horas, this.minutos, this.segundos);

    if (qntosMinutos > 0) {
        novaHora.minutos += qntosMinutos;
        novaHora.converterMinutos();
    }

    return novaHora;
}

    public boolean estanaFrente(Hora outra){
          int estaHora = this.horas *60 *60 + this.minutos *60 + this.segundos;
         int outraHora = outra.horas *60 *60 + outra.minutos *60 + outra.segundos;

     return (estaHora>outraHora); // estahora é maior que esta hora?  retorna sim ou não
    }

}
