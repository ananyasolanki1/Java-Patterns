public class AlphaTriangle {
    public static void main(String[] args) {

        // D
        // CD
        // BCD
        // ABCD

        int n = 4;
        char ch = (char) ('A' + (n-1));
        // char ch = 'A';
        // ch += (n-1);
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(ch++);
            }
            ch -= (r+1);
            System.out.println();
        }
    }
}
