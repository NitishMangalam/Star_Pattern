public class RightAlignedNumberTriangle {
    public static void main(String[] args) {
patternTriangle(7);
    }
    static void patternTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            // for spaces
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    
}
