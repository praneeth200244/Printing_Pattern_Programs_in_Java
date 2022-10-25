//Inverted pyramid with odd, even number of star(s) in a row
public class Pattern_7 {
    public static void main(String[] args) {
        for (int i=5; i>=1; i--) {
            for (int space=5; space>i; space--) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=5; i>=1; i--) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        for (int i=5; i>=1; i--) {
            for (int space=5; space>i; space--) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=5; i>=1; i--) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
