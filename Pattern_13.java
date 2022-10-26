//Triangle and inverted triangle without base
public class Pattern_13 {
    public static void main(String[] args) {
        for (int i=1; i<=8; i++) {
            for (int j=1; j<=(8-i); j++) {
                System.out.print("  ");
            }
            for (int k=1; k<(2*i); k++) {
                if ((k>1) && (k<2*i-1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        int rows = 8;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<(2*rows); j++) {
                if ((i == j) || (i+j == (2*rows))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
