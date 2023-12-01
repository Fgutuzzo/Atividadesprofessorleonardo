

import java.util.Scanner;
public class forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraParaAdivinhar = escolherPalavra();

        char[] palavraAdivinhada = new char[palavraParaAdivinhar.length()];
        for (int i = 0; i < palavraAdivinhada.length; i++) {
            palavraAdivinhada[i] = '_';
        }

        int tentativasRestantes = 6;

        while (tentativasRestantes > 0) {
           
            exibirPalavraAdivinhada(palavraAdivinhada);

            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            char letraDigitada = scanner.next().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < palavraParaAdivinhar.length(); i++) {
                if (palavraParaAdivinhar.charAt(i) == letraDigitada) {
                    palavraAdivinhada[i] = letraDigitada;
                    letraEncontrada = true;
                }
            }

            if (palavraCompleta(palavraAdivinhada)) {
                System.out.println("Parabéns! Você adivinhou a palavra: " + palavraParaAdivinhar);
                break;
            }

            if (!letraEncontrada) {
                tentativasRestantes--;
                System.out.println("Letra não encontrada. Tente novamente!");
            }
        }

        if (tentativasRestantes == 0) {
            System.out.println("Você perdeu! A palavra correta era: " + palavraParaAdivinhar);
        }

        scanner.close();
    }

    private static String escolherPalavra() {

        String[] palavras = {"java", "programacao", "computador", "desenvolvimento", "forca"};
        int indice = (int) (Math.random() * palavras.length);
        return palavras[indice];
    }

    private static void exibirPalavraAdivinhada(char[] palavraAdivinhada) {
        System.out.print("Palavra: ");
        for (char c : palavraAdivinhada) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static boolean palavraCompleta(char[] palavraAdivinhada) {
        for (char c : palavraAdivinhada) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

}