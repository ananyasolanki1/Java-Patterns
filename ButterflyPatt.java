public class ButterflyPatt {
    public static void main(String[] args) {
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        int n = 4;   // input number. Can change this value

        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++) {
                System.out.print("*");
            }
            for (int c=3; c>=r; c--){
                System.out.print(" ");
            }
            for (int c=3; c>=r; c--){
                System.out.print(" ");
            }
            for (int c=1; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int r=n; r>=1; r--) {
            for (int c=1; c<=r; c++) {
                System.out.print("*");
            }
            for (int c=3; c>=r; c--){
                System.out.print(" ");
            }
            for (int c=3; c>=r; c--){
                System.out.print(" ");
            }
            for (int c=1; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
