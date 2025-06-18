public class Zero_One_Triangle {
    public static void main(String[] args) {
printZeroOneTriangle(7);
    }
    static void printZeroOneTriangle(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                if ((row+col)%2==0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
