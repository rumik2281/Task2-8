public class FigurePrinter {
    public void print() {
        final int numberOfSymbols = 8;
        for (int j = 2; j <= 8; j += 2) {
            int ost = (numberOfSymbols - j) / 2;
            String sb = " ".repeat(ost) + "*".repeat(j);
            System.out.println(sb);
        }
        for (int j = 8; j >= 2; j -= 2) {
            int ost = (numberOfSymbols - j) / 2;
            String sb = " ".repeat(ost) + "*".repeat(j);
            System.out.println(sb);
        }
    }
}
