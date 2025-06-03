

public class NumberSquare {
    public static void main(String[] args) {

        // 3 3 3 3 3
        // 3 2 2 2 3
        // 3 2 1 2 3
        // 3 2 2 2 3
        // 3 3 3 3 3

        int n = 5;
        int K = 2 * n - 1;
        
        for (int r = 0; r < K; r++) {
            for (int c = 0; c < K; c++) {
                int X = Math.abs(r - (n - 1));
                int Y = Math.abs(c - (n - 1));
                System.out.print((Math.max(X, Y) + 1) + " ");
            }
            System.out.println();
        }
    }
}
