public class Ex1treino {
    
    public static void Menu() {
        IO.println("Digite uma palavra para ser invertida!");
        String palavra = IO.readln();

        String invertida = InverterPalavra(palavra);
        IO.println("Palavra invertida: " + invertida);
    }

    public static String InverterPalavra(String palavra) {
        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        return invertida;
    }

    void main() {

        String resposta;

        do {
            Menu();

            IO.println("Deseja parar? Digite 'finalizar'");
            resposta = IO.readln();  

        } while (!resposta.equals("finalizar"));
    }
}