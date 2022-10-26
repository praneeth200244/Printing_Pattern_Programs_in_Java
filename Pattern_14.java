//Triangle and inverted triangle
public class Pattern_14 {
    public static void main(String[] args) {
        int rows=15;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<(2*rows); j++) {
                if ((i+j == rows+1) || (j-i == rows-1) || (i == rows)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        rows = 15;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<(2*rows); j++) {
                if ((i == j) || (i == 1) || (i+j == (2*rows))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
