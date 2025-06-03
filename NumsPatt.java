public class NumsPatt {
    public static void main(String[] args) {
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int n = 5;
        int cnt = 0;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                cnt = cnt + 1; 
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}

// Floyd's triangle