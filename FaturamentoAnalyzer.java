
import java.util.List;
import java.util.ArrayList;

public class FaturamentoAnalyzer {
    public static void main(String[] args) {
        List<Double> faturamento = new ArrayList<>();
        faturamento.add(1200.0);
        faturamento.add(3000.0);
        faturamento.add(500.0);
        faturamento.add(7000.0);

        double menor = faturamento.get(0);
        double maior = faturamento.get(0);
        double soma = 0;
        int diasValidos = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
                soma = soma + valor;
                diasValidos++;
            }
        }

        if (diasValidos > 0) {
            double media = soma / diasValidos;
            int diasAcimaMedia = 0;
            for (double valor : faturamento) {
                if (valor > media) {
                    diasAcimaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menor);
            System.out.println("Maior faturamento: " + maior);
            System.out.println("Dias acima da média: " + diasAcimaMedia);
        } else {
            System.out.println("Nenhum faturamento válido.");
        }
    }
}