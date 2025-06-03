public class Counting {
    public static void main(String[] args) {

        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 
        // 16 17 18 19 20 21 

        int n = 6;
        int dig = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(dig + " ");
                dig++;
            }
            System.out.println();
        }
    }
}
