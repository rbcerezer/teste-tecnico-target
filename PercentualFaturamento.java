
public class PercentualFaturamento {
    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double total = SP + RJ + MG + ES + Outros;

        if (total > 0) {
            System.out.println("SP: " + (SP / total) * 100 + "%");
            System.out.println("RJ: " + (RJ / total) * 100 + "%");
            System.out.println("MG: " + (MG / total) * 100 + "%");
            System.out.println("ES: " + (ES / total) * 100 + "%");
            System.out.println("Outros: " + (Outros / total) * 100 + "%");
        } else {
            System.out.println("Faturamento total é zero, impossível calcular percentuais.");
        }
    }
}