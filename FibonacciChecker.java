
import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean pertence = verificaFibonacci(num);
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        return b == n || n == 0;
    }
}