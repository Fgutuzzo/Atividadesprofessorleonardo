import java.util.Scanner;

public class palavrainvertida {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = inverterPalavra(palavra);


        System.out.println("Palavra invertida: " + palavraInvertida);


        scanner.close();
    }


    private static String inverterPalavra(String palavra) {

        char[] caracteres = palavra.toCharArray();


        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        return new String(caracteres);
    }
}