public class halfDiamondStarPattern {
    public static void main(String[] args) {
        diamondPattern9(7);
    }
    static void diamondPattern9(int n) {
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalColsInRow = row>n ?2*n-row:row;
            int noOfSpaces = n-totalColsInRow;
            for (int space = 1; space <=noOfSpaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=totalColsInRow ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

