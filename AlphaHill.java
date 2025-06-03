public class AlphaHill {
    public static void main(String[] args) {
        
        //     A
        //   A B A
        // A B C B A

        int n = 4;
        // for (int r = 1; r <= n; r++) {
        //     char ch = 'A';
        //     for (int c = n-1; c >= r; c--) {
        //         System.out.print("  ");
        //     }
        //     for (int c = 1; c <= r; c++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     ch -= 2;
        //     for (int c = r; c > 1; c--) {
        //         System.out.print(ch + " ");
        //         ch--;
        //     }
        //     System.out.println();
        // }

        for (int r = 1; r <= n; r++) {
            StringBuilder line = new StringBuilder();
            char ch = 'A';
            for (int c = n-1; c >= r; c--) {
                line.append("  ");
            }
            for (int c = 1; c <= r; c++) {
                line.append(ch++).append(" ");
            }
            ch -= 2;
            for (int c = r; c > 1; c--) {
                line.append(ch--).append(" ");
            }
            System.out.println(line);
        }
    }
}
