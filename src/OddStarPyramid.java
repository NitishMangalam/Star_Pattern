public class OddStarPyramid {
    public static void main(String[] args) {
patternOddPyramid6(7);
    }
    static void patternOddPyramid6(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int space = 1; space <=n-row ; space++) {
                System.out.print(" ");
            }
            int totalStars = 2*row-1;
            for (int col = 1; col <=totalStars ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
