public class HalfPry3 {
    public static void main(String[] args) {
        //     *
        //    **
        //   ***
        //  ****   

        int n = 4;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n-r; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {      
                System.out.print("*");
            }
            System.out.println();
        }

    }
}