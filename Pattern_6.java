//Pyramid with odd, even number of star(s) in a row
public class Pattern_6 {
    public static void main(String[] args) {

        for (int i=1; i<=8; i++) {
            for (int j=1; j<=(8-i); j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=(2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");


        for (int i=1; i<=8; i++) {
            for (int j=1; j<=(8-i); j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=(2*i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=8; i++) {
            for (int space=1; space<=(8-i); space++) {
                System.out.print(" ");
            }
            for (int star=1; star<=i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
