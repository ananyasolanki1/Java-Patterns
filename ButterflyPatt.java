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

        for (int r=1; r<=4; r++) {
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
        for (int r=4; r>=1; r--) {
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
