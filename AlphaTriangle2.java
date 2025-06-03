public class AlphaTriangle2 {
    public static void main(String[] args) {

            // C
            // C B 
            // C B A

        int n = 4;
        char ch = (char) ('A' + (n-1));
        char nch = ch;
        // char ch = 'A';
        // ch += (n-1);
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(ch--);
            }
            ch = nch;
            System.out.println();
        }
    }
}
