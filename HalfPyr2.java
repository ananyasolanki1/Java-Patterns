public class HalfPyr2 {

    public static void main(String[] args) {
        // ****
        // ***
        // **
        // *

        int n = 4;  // input

        for (int r = 1; r <= n; r++) {
            for (int c = n; c >= r; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}