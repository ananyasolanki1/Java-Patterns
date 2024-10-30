public class NumPalin {
    public static void main(String[] args) {
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        
        for (int r=1; r<=5; r++) {          // I did this all by A HELL LOT OF trial and error
            for (int c=4; c>=r; c--) {
                System.out.print("  ");
            }
            for (int i=0; i<r; i++) {
                System.out.print(r-i + " ");
            }
            for (int cm=3; cm<=(r+1); cm++) {
                System.out.print(cm-1 + " ");
            }
            System.out.println();
        }

        // for (int r=1; r<=7; r++) {                   // prints * triangle. try it
        //     for (int c=6; c>=r; c--) {
        //         System.out.print(" ");
        //     }
        //     for (int c=1; c<=r; c++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }
    }
}
