
import java.util.Scanner;

public class InversorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        scanner.close();

        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida = invertida + texto.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}