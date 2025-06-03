public class DiamondPatt {
    public static void main(String[] args) {
        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *
        
        int n=3;

        for (int r=1; r<=n; r++) {
            for (int c=n-1; c>=r; c--) {
                System.out.print("  ");
            }
            for (int c=1; c<=r; c++) {          // instead of this and below for loop, try 2*r-1
                System.out.print("* ");
            }
            for (int c=2; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r=n; r>=1; r--) {
            for (int c=n-1; c>=r; c--) {
                System.out.print("  ");
            }
            for (int c=1; c<=r; c++) {
                System.out.print("* ");
            }
            for (int c=2; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// https://docs.google.com/document/d/1uh_l3ifDCfy9ljDgzK1wjaP2Vpz3sEAA4ADHAtbKfJ0/edit
// try HW problems given in above link