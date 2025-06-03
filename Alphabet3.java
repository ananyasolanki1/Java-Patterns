public class Alphabet3 {
    public static void main(String[] args) {
        
        // A
        // B B
        // C C C
        
        int n = 6;

        char ch = 'A';
        for (int r = 1; r <= n; r++) {
            StringBuilder line = new StringBuilder();
            for (int c = 1; c <= r; c++) {
                line.append(ch).append(" "); // Efficiently builds the string
            }
            ch++;
            System.out.println(line); // Prints the entire line at once
        }

    }
}
