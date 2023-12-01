import java.security.SecureRandom;
import java.util.Scanner;

public class gerador {

    public static String gerarSenha(int tamanho) {System.err.println();
        String caracteres = "afksdflskslkslkslksVKSNVSNVSKVKSVSMV@!#$$%";
        StringBuilder senha = new StringBuilder();

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));

        }

        return senha.toString();

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Senha gerada: " + gerarSenha(12));
        System.out.print("Deseja gerar outra senha? (S/N): ");

        String resposta = scanner.nextLine().trim().toLowerCase();

        if (!resposta.equals("s")) {
            System.out.println("Programa encerrado. Adeus!");
            break;
            }
        }

        scanner.close();
    }
}