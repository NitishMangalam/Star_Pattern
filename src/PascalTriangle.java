public class PascalTriangle {
    public static void main(String[] args) {
       patternPascalTriangle(7);
    }
    static void patternPascalTriangle(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int col = 1; col <=row ; col++) {
                System.out.print(value+" ");
                if (col!=row)
                    value=value*(row-col)/col;
            }
            System.out.println();
        }
    }
}
